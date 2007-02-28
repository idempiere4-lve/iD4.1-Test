/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software;
 you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY;
 without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program;
 if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

/** Generated Model - DO NOT CHANGE */
import java.util.*;
import java.sql.*;
import java.math.*;
import org.compiere.util.*;
/** Generated Model for C_RfQ
 *  @author Adempiere (generated) 
 *  @version Release 3.1.5 - $Id$ */
public class X_C_RfQ extends PO
{
/** Standard Constructor
@param ctx context
@param C_RfQ_ID id
@param trxName transaction
*/
public X_C_RfQ (Properties ctx, int C_RfQ_ID, String trxName)
{
super (ctx, C_RfQ_ID, trxName);
/** if (C_RfQ_ID == 0)
{
setC_Currency_ID (0);	// @$C_Currency_ID @
setC_RfQ_ID (0);
setC_RfQ_Topic_ID (0);
setDateResponse (new Timestamp(System.currentTimeMillis()));
setDocumentNo (null);
setIsInvitedVendorsOnly (false);
setIsQuoteAllQty (false);
setIsQuoteTotalAmt (false);
setIsRfQResponseAccepted (true);	// Y
setIsSelfService (true);	// Y
setName (null);
setProcessed (false);
setQuoteType (null);	// S
setSalesRep_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_RfQ (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=677 */
public static final int Table_ID=MTable.getTable_ID("C_RfQ");

/** TableName=C_RfQ */
public static final String Table_Name="C_RfQ";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_RfQ");

protected BigDecimal accessLevel = BigDecimal.valueOf(1);
/** AccessLevel
@return 1 - Org 
*/
protected int get_AccessLevel()
{
return accessLevel.intValue();
}
/** Load Meta Data
@param ctx context
@return PO Info
*/
protected POInfo initPO (Properties ctx)
{
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_RfQ[").append(get_ID()).append("]");
return sb.toString();
}
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_Value ("AD_User_ID", null);
 else 
set_Value ("AD_User_ID", Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value("AD_User_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_Value ("C_BPartner_ID", null);
 else 
set_Value ("C_BPartner_ID", Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value("C_BPartner_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Partner Location.
@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner */
public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
{
if (C_BPartner_Location_ID <= 0) set_Value ("C_BPartner_Location_ID", null);
 else 
set_Value ("C_BPartner_Location_ID", Integer.valueOf(C_BPartner_Location_ID));
}
/** Get Partner Location.
@return Identifies the (ship to) address for this Business Partner */
public int getC_BPartner_Location_ID() 
{
Integer ii = (Integer)get_Value("C_BPartner_Location_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
set_Value ("C_Currency_ID", Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value("C_Currency_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID <= 0) set_Value ("C_Order_ID", null);
 else 
set_Value ("C_Order_ID", Integer.valueOf(C_Order_ID));
}
/** Get Order.
@return Order */
public int getC_Order_ID() 
{
Integer ii = (Integer)get_Value("C_Order_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
/** Set RfQ.
@param C_RfQ_ID Request for Quotation */
public void setC_RfQ_ID (int C_RfQ_ID)
{
if (C_RfQ_ID < 1) throw new IllegalArgumentException ("C_RfQ_ID is mandatory.");
set_ValueNoCheck ("C_RfQ_ID", Integer.valueOf(C_RfQ_ID));
}
/** Get RfQ.
@return Request for Quotation */
public int getC_RfQ_ID() 
{
Integer ii = (Integer)get_Value("C_RfQ_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_RfQ_ID */
public static final String COLUMNNAME_C_RfQ_ID = "C_RfQ_ID";
/** Set RfQ Topic.
@param C_RfQ_Topic_ID Topic for Request for Quotations */
public void setC_RfQ_Topic_ID (int C_RfQ_Topic_ID)
{
if (C_RfQ_Topic_ID < 1) throw new IllegalArgumentException ("C_RfQ_Topic_ID is mandatory.");
set_Value ("C_RfQ_Topic_ID", Integer.valueOf(C_RfQ_Topic_ID));
}
/** Get RfQ Topic.
@return Topic for Request for Quotations */
public int getC_RfQ_Topic_ID() 
{
Integer ii = (Integer)get_Value("C_RfQ_Topic_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_RfQ_Topic_ID */
public static final String COLUMNNAME_C_RfQ_Topic_ID = "C_RfQ_Topic_ID";
/** Set Copy Lines.
@param CopyLines Copy Lines */
public void setCopyLines (String CopyLines)
{
if (CopyLines != null && CopyLines.length() > 1)
{
log.warning("Length > 1 - truncated");
CopyLines = CopyLines.substring(0,0);
}
set_Value ("CopyLines", CopyLines);
}
/** Get Copy Lines.
@return Copy Lines */
public String getCopyLines() 
{
return (String)get_Value("CopyLines");
}
/** Column name CopyLines */
public static final String COLUMNNAME_CopyLines = "CopyLines";
/** Set Create PO.
@param CreatePO Create Purchase Order */
public void setCreatePO (String CreatePO)
{
if (CreatePO != null && CreatePO.length() > 1)
{
log.warning("Length > 1 - truncated");
CreatePO = CreatePO.substring(0,0);
}
set_Value ("CreatePO", CreatePO);
}
/** Get Create PO.
@return Create Purchase Order */
public String getCreatePO() 
{
return (String)get_Value("CreatePO");
}
/** Column name CreatePO */
public static final String COLUMNNAME_CreatePO = "CreatePO";
/** Set Create SO.
@param CreateSO Create SO */
public void setCreateSO (String CreateSO)
{
if (CreateSO != null && CreateSO.length() > 1)
{
log.warning("Length > 1 - truncated");
CreateSO = CreateSO.substring(0,0);
}
set_Value ("CreateSO", CreateSO);
}
/** Get Create SO.
@return Create SO */
public String getCreateSO() 
{
return (String)get_Value("CreateSO");
}
/** Column name CreateSO */
public static final String COLUMNNAME_CreateSO = "CreateSO";
/** Set Response Date.
@param DateResponse Date of the Response */
public void setDateResponse (Timestamp DateResponse)
{
if (DateResponse == null) throw new IllegalArgumentException ("DateResponse is mandatory.");
set_Value ("DateResponse", DateResponse);
}
/** Get Response Date.
@return Date of the Response */
public Timestamp getDateResponse() 
{
return (Timestamp)get_Value("DateResponse");
}
/** Column name DateResponse */
public static final String COLUMNNAME_DateResponse = "DateResponse";
/** Set Work Complete.
@param DateWorkComplete Date when work is (planned to be) complete */
public void setDateWorkComplete (Timestamp DateWorkComplete)
{
set_Value ("DateWorkComplete", DateWorkComplete);
}
/** Get Work Complete.
@return Date when work is (planned to be) complete */
public Timestamp getDateWorkComplete() 
{
return (Timestamp)get_Value("DateWorkComplete");
}
/** Column name DateWorkComplete */
public static final String COLUMNNAME_DateWorkComplete = "DateWorkComplete";
/** Set Work Start.
@param DateWorkStart Date when work is (planned to be) started */
public void setDateWorkStart (Timestamp DateWorkStart)
{
set_Value ("DateWorkStart", DateWorkStart);
}
/** Get Work Start.
@return Date when work is (planned to be) started */
public Timestamp getDateWorkStart() 
{
return (Timestamp)get_Value("DateWorkStart");
}
/** Column name DateWorkStart */
public static final String COLUMNNAME_DateWorkStart = "DateWorkStart";
/** Set Delivery Days.
@param DeliveryDays Number of Days (planned) until Delivery */
public void setDeliveryDays (int DeliveryDays)
{
set_Value ("DeliveryDays", Integer.valueOf(DeliveryDays));
}
/** Get Delivery Days.
@return Number of Days (planned) until Delivery */
public int getDeliveryDays() 
{
Integer ii = (Integer)get_Value("DeliveryDays");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name DeliveryDays */
public static final String COLUMNNAME_DeliveryDays = "DeliveryDays";
/** Set Description.
@param Description Optional short description of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value ("Description", Description);
}
/** Get Description.
@return Optional short description of the record */
public String getDescription() 
{
return (String)get_Value("Description");
}
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo == null) throw new IllegalArgumentException ("DocumentNo is mandatory.");
if (DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
DocumentNo = DocumentNo.substring(0,29);
}
set_Value ("DocumentNo", DocumentNo);
}
/** Get Document No.
@return Document sequence number of the document */
public String getDocumentNo() 
{
return (String)get_Value("DocumentNo");
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getDocumentNo());
}
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
if (Help != null && Help.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Help = Help.substring(0,1999);
}
set_Value ("Help", Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
return (String)get_Value("Help");
}
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
/** Set Invited Vendors Only.
@param IsInvitedVendorsOnly Only invited vendors can respond to an RfQ */
public void setIsInvitedVendorsOnly (boolean IsInvitedVendorsOnly)
{
set_Value ("IsInvitedVendorsOnly", Boolean.valueOf(IsInvitedVendorsOnly));
}
/** Get Invited Vendors Only.
@return Only invited vendors can respond to an RfQ */
public boolean isInvitedVendorsOnly() 
{
Object oo = get_Value("IsInvitedVendorsOnly");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Column name IsInvitedVendorsOnly */
public static final String COLUMNNAME_IsInvitedVendorsOnly = "IsInvitedVendorsOnly";
/** Set Quote All Quantities.
@param IsQuoteAllQty Suppliers are requested to provide responses for all quantities */
public void setIsQuoteAllQty (boolean IsQuoteAllQty)
{
set_Value ("IsQuoteAllQty", Boolean.valueOf(IsQuoteAllQty));
}
/** Get Quote All Quantities.
@return Suppliers are requested to provide responses for all quantities */
public boolean isQuoteAllQty() 
{
Object oo = get_Value("IsQuoteAllQty");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Column name IsQuoteAllQty */
public static final String COLUMNNAME_IsQuoteAllQty = "IsQuoteAllQty";
/** Set Quote Total Amt.
@param IsQuoteTotalAmt The respnse can have just the total amount for the RfQ */
public void setIsQuoteTotalAmt (boolean IsQuoteTotalAmt)
{
set_Value ("IsQuoteTotalAmt", Boolean.valueOf(IsQuoteTotalAmt));
}
/** Get Quote Total Amt.
@return The respnse can have just the total amount for the RfQ */
public boolean isQuoteTotalAmt() 
{
Object oo = get_Value("IsQuoteTotalAmt");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Column name IsQuoteTotalAmt */
public static final String COLUMNNAME_IsQuoteTotalAmt = "IsQuoteTotalAmt";
/** Set Responses Accepted.
@param IsRfQResponseAccepted Are Resonses to the Request for Quotation accepted */
public void setIsRfQResponseAccepted (boolean IsRfQResponseAccepted)
{
set_Value ("IsRfQResponseAccepted", Boolean.valueOf(IsRfQResponseAccepted));
}
/** Get Responses Accepted.
@return Are Resonses to the Request for Quotation accepted */
public boolean isRfQResponseAccepted() 
{
Object oo = get_Value("IsRfQResponseAccepted");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Column name IsRfQResponseAccepted */
public static final String COLUMNNAME_IsRfQResponseAccepted = "IsRfQResponseAccepted";
/** Set Self-Service.
@param IsSelfService This is a Self-Service entry or this entry can be changed via Self-Service */
public void setIsSelfService (boolean IsSelfService)
{
set_Value ("IsSelfService", Boolean.valueOf(IsSelfService));
}
/** Get Self-Service.
@return This is a Self-Service entry or this entry can be changed via Self-Service */
public boolean isSelfService() 
{
Object oo = get_Value("IsSelfService");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Column name IsSelfService */
public static final String COLUMNNAME_IsSelfService = "IsSelfService";
/** Set Margin %.
@param Margin Margin for a product as a percentage */
public void setMargin (BigDecimal Margin)
{
set_Value ("Margin", Margin);
}
/** Get Margin %.
@return Margin for a product as a percentage */
public BigDecimal getMargin() 
{
BigDecimal bd = (BigDecimal)get_Value("Margin");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name Margin */
public static final String COLUMNNAME_Margin = "Margin";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_Value ("Name", Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
return (String)get_Value("Name");
}
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value ("Processed", Boolean.valueOf(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value("Processed");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value ("Processing", Boolean.valueOf(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value("Processing");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Publish RfQ.
@param PublishRfQ Publish RfQ */
public void setPublishRfQ (String PublishRfQ)
{
if (PublishRfQ != null && PublishRfQ.length() > 1)
{
log.warning("Length > 1 - truncated");
PublishRfQ = PublishRfQ.substring(0,0);
}
set_Value ("PublishRfQ", PublishRfQ);
}
/** Get Publish RfQ.
@return Publish RfQ */
public String getPublishRfQ() 
{
return (String)get_Value("PublishRfQ");
}
/** Column name PublishRfQ */
public static final String COLUMNNAME_PublishRfQ = "PublishRfQ";

/** QuoteType AD_Reference_ID=314 */
public static final int QUOTETYPE_AD_Reference_ID=314;
/** Quote All Lines = A */
public static final String QUOTETYPE_QuoteAllLines = "A";
/** Quote Selected Lines = S */
public static final String QUOTETYPE_QuoteSelectedLines = "S";
/** Quote Total only = T */
public static final String QUOTETYPE_QuoteTotalOnly = "T";
/** Set RfQ Type.
@param QuoteType Request for Quotation Type */
public void setQuoteType (String QuoteType)
{
if (QuoteType == null) throw new IllegalArgumentException ("QuoteType is mandatory");
if (QuoteType.equals("A") || QuoteType.equals("S") || QuoteType.equals("T"));
 else throw new IllegalArgumentException ("QuoteType Invalid value - " + QuoteType + " - Reference_ID=314 - A - S - T");
if (QuoteType.length() > 1)
{
log.warning("Length > 1 - truncated");
QuoteType = QuoteType.substring(0,0);
}
set_Value ("QuoteType", QuoteType);
}
/** Get RfQ Type.
@return Request for Quotation Type */
public String getQuoteType() 
{
return (String)get_Value("QuoteType");
}
/** Column name QuoteType */
public static final String COLUMNNAME_QuoteType = "QuoteType";
/** Set Rank RfQ.
@param RankRfQ Rank RfQ */
public void setRankRfQ (String RankRfQ)
{
if (RankRfQ != null && RankRfQ.length() > 1)
{
log.warning("Length > 1 - truncated");
RankRfQ = RankRfQ.substring(0,0);
}
set_Value ("RankRfQ", RankRfQ);
}
/** Get Rank RfQ.
@return Rank RfQ */
public String getRankRfQ() 
{
return (String)get_Value("RankRfQ");
}
/** Column name RankRfQ */
public static final String COLUMNNAME_RankRfQ = "RankRfQ";

/** SalesRep_ID AD_Reference_ID=190 */
public static final int SALESREP_ID_AD_Reference_ID=190;
/** Set Sales Representative.
@param SalesRep_ID Sales Representative or Company Agent */
public void setSalesRep_ID (int SalesRep_ID)
{
if (SalesRep_ID < 1) throw new IllegalArgumentException ("SalesRep_ID is mandatory.");
set_Value ("SalesRep_ID", Integer.valueOf(SalesRep_ID));
}
/** Get Sales Representative.
@return Sales Representative or Company Agent */
public int getSalesRep_ID() 
{
Integer ii = (Integer)get_Value("SalesRep_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
}
