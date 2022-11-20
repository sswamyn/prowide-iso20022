
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Card transaction for which the authorisation has been requested.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransaction8", propOrder = {
    "txTp",
    "rcncltn",
    "accptrTxDtTm",
    "initrTxId",
    "txLifeCyclId",
    "txLifeCyclSeqNb",
    "txLifeCyclSeqCntr",
    "txDtls",
    "txRspn"
})
public class CardTransaction8 {

    @XmlElement(name = "TxTp", required = true)
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType7Code txTp;
    @XmlElement(name = "Rcncltn")
    protected TransactionIdentifier2 rcncltn;
    @XmlElement(name = "AccptrTxDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accptrTxDtTm;
    @XmlElement(name = "InitrTxId", required = true)
    protected String initrTxId;
    @XmlElement(name = "TxLifeCyclId")
    protected String txLifeCyclId;
    @XmlElement(name = "TxLifeCyclSeqNb")
    protected BigDecimal txLifeCyclSeqNb;
    @XmlElement(name = "TxLifeCyclSeqCntr")
    protected BigDecimal txLifeCyclSeqCntr;
    @XmlElement(name = "TxDtls", required = true)
    protected CardTransactionDetail6 txDtls;
    @XmlElement(name = "TxRspn", required = true)
    protected ResponseType2 txRspn;

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType7Code }
     *     
     */
    public CardPaymentServiceType7Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType7Code }
     *     
     */
    public CardTransaction8 setTxTp(CardPaymentServiceType7Code value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the rcncltn property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier2 }
     *     
     */
    public TransactionIdentifier2 getRcncltn() {
        return rcncltn;
    }

    /**
     * Sets the value of the rcncltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier2 }
     *     
     */
    public CardTransaction8 setRcncltn(TransactionIdentifier2 value) {
        this.rcncltn = value;
        return this;
    }

    /**
     * Gets the value of the accptrTxDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getAccptrTxDtTm() {
        return accptrTxDtTm;
    }

    /**
     * Sets the value of the accptrTxDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransaction8 setAccptrTxDtTm(XMLGregorianCalendar value) {
        this.accptrTxDtTm = value;
        return this;
    }

    /**
     * Gets the value of the initrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitrTxId() {
        return initrTxId;
    }

    /**
     * Sets the value of the initrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransaction8 setInitrTxId(String value) {
        this.initrTxId = value;
        return this;
    }

    /**
     * Gets the value of the txLifeCyclId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxLifeCyclId() {
        return txLifeCyclId;
    }

    /**
     * Sets the value of the txLifeCyclId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransaction8 setTxLifeCyclId(String value) {
        this.txLifeCyclId = value;
        return this;
    }

    /**
     * Gets the value of the txLifeCyclSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTxLifeCyclSeqNb() {
        return txLifeCyclSeqNb;
    }

    /**
     * Sets the value of the txLifeCyclSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CardTransaction8 setTxLifeCyclSeqNb(BigDecimal value) {
        this.txLifeCyclSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the txLifeCyclSeqCntr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTxLifeCyclSeqCntr() {
        return txLifeCyclSeqCntr;
    }

    /**
     * Sets the value of the txLifeCyclSeqCntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CardTransaction8 setTxLifeCyclSeqCntr(BigDecimal value) {
        this.txLifeCyclSeqCntr = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransactionDetail6 }
     *     
     */
    public CardTransactionDetail6 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransactionDetail6 }
     *     
     */
    public CardTransaction8 setTxDtls(CardTransactionDetail6 value) {
        this.txDtls = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType2 }
     *     
     */
    public ResponseType2 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType2 }
     *     
     */
    public CardTransaction8 setTxRspn(ResponseType2 value) {
        this.txRspn = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}