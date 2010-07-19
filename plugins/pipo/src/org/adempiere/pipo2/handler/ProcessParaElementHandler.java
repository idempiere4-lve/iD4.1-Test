/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2006 Adempiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *
 * Copyright (C) 2005 Robert Klein. robeklein@hotmail.com
 * Contributor(s): Low Heng Sin hengsin@avantz.com
 *****************************************************************************/
package org.adempiere.pipo2.handler;

import java.util.List;
import java.util.Properties;

import javax.xml.transform.sax.TransformerHandler;

import org.adempiere.exceptions.AdempiereException;
import org.adempiere.pipo2.AbstractElementHandler;
import org.adempiere.pipo2.IPackOutHandler;
import org.adempiere.pipo2.PoExporter;
import org.adempiere.pipo2.Element;
import org.adempiere.pipo2.PackOut;
import org.adempiere.pipo2.PoFiller;
import org.adempiere.pipo2.exception.POSaveFailedException;
import org.compiere.model.X_AD_Package_Imp_Detail;
import org.compiere.model.X_AD_Process_Para;
import org.compiere.util.Env;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

public class ProcessParaElementHandler extends AbstractElementHandler {

	public void startElement(Properties ctx, Element element)
			throws SAXException {
		List<String> excludes = defaultExcludeList(X_AD_Process_Para.Table_Name);

		String entitytype = getStringValue(element, "EntityType");
		if (isProcessElement(ctx, entitytype)) {
			if (isParentDefer(element, "process")) {
				element.defer = true;
				return;
			}

			String name = getStringValue(element, "Name");

			int id = 0;
			int masterId = 0;
			String processValue = "";
			if (getParentId(element, "process") > 0) {
				masterId = getParentId(element, "process");
			} else {
				processValue =  getStringValue(element, "AD_Process.Value", excludes);
				if (processValue != null && processValue.trim().length() > 0) {
					masterId = findIdByColumn(ctx, "AD_Process", "Value", processValue);
				}
			}
			if (masterId <= 0) {
				element.defer = true;
				element.unresolved = "AD_Process: " + processValue;
				return;
			}

			X_AD_Package_Imp_Detail impDetail = createImportDetail(ctx, element.qName, X_AD_Process_Para.Table_Name,
					X_AD_Process_Para.Table_ID);

			id = findIdByColumnAndParentId(ctx, "AD_Process_Para", "Name",
					name, "AD_Process", masterId);

			X_AD_Process_Para mProcessPara = new X_AD_Process_Para(ctx, id,
					getTrxName(ctx));
			String action = null;
			if (id <= 0 && isOfficialId(element, "AD_Process_Para_ID"))
				mProcessPara.setAD_Process_Para_ID(Integer.parseInt(getStringValue(element, "AD_Process_Para_ID")));
			if (id > 0) {
				backupRecord(ctx, impDetail.getAD_Package_Imp_Detail_ID(), X_AD_Process_Para.Table_Name,
						mProcessPara);
				action = "Update";
			} else {
				action = "New";
			}

			mProcessPara.setAD_Process_ID(masterId);

			PoFiller filler = new PoFiller(ctx, mProcessPara, element, this);

			List<String> notfounds = filler.autoFill(excludes);
			if (notfounds.size() > 0) {
				element.defer = true;
				return;
			}

			if (mProcessPara.save(getTrxName(ctx)) == true) {
				logImportDetail(ctx, impDetail, 1, mProcessPara.getName(),
						mProcessPara.get_ID(), action);
			} else {
				logImportDetail(ctx, impDetail, 0, mProcessPara.getName(),
						mProcessPara.get_ID(), action);
				throw new POSaveFailedException("ProcessPara");
			}
		} else {
			element.skip = true;
		}
	}

	public void endElement(Properties ctx, Element element) throws SAXException {
	}

	public void create(Properties ctx, TransformerHandler document)
			throws SAXException {
		int AD_Process_Para_ID = Env.getContextAsInt(ctx,
				X_AD_Process_Para.COLUMNNAME_AD_Process_Para_ID);
		X_AD_Process_Para m_Processpara = new X_AD_Process_Para(ctx,
				AD_Process_Para_ID, getTrxName(ctx));

		if (m_Processpara.getAD_Element_ID() > 0) {
			PackOut packOut = getPackOutProcess(ctx);
			IPackOutHandler handler = packOut.getHandler("ELE");
			try {
				handler.packOut(packOut,null,null,document,null,m_Processpara.getAD_Element_ID());
			} catch (Exception e) {
				throw new AdempiereException(e);
			}
		}
		AttributesImpl atts = new AttributesImpl();
		atts.addAttribute("", "", "type", "CDATA", "object");
		atts.addAttribute("", "", "type-name", "CDATA", "ad.process.parameter");
		document.startElement("", "", "processpara", atts);
		createProcessParaBinding(ctx, document, m_Processpara);
		document.endElement("", "", "processpara");
	}

	private void createProcessParaBinding(Properties ctx, TransformerHandler document,
			X_AD_Process_Para m_Processpara) {

		PoExporter filler = new PoExporter(ctx, document, m_Processpara);
		List<String> excludes = defaultExcludeList(X_AD_Process_Para.Table_Name);

		if (m_Processpara.getAD_Process_Para_ID() <= PackOut.MAX_OFFICIAL_ID)
	        filler.add("AD_Process_Para_ID", new AttributesImpl());
		filler.export(excludes);
	}
}
