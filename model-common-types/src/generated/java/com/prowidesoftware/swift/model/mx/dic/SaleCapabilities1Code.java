
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaleCapabilities1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SaleCapabilities1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CHDI"/&gt;
 *     &lt;enumeration value="CHER"/&gt;
 *     &lt;enumeration value="CHIN"/&gt;
 *     &lt;enumeration value="CHST"/&gt;
 *     &lt;enumeration value="CUDI"/&gt;
 *     &lt;enumeration value="CUAS"/&gt;
 *     &lt;enumeration value="CUER"/&gt;
 *     &lt;enumeration value="CUIN"/&gt;
 *     &lt;enumeration value="POIR"/&gt;
 *     &lt;enumeration value="PRDC"/&gt;
 *     &lt;enumeration value="PRRP"/&gt;
 *     &lt;enumeration value="PRVC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SaleCapabilities1Code")
@XmlEnum
public enum SaleCapabilities1Code {


    /**
     * Standard Cashier display interface (to ask question, or to show information). 
     * 
     */
    CHDI,

    /**
     * To display to the Cashier information related to an error situation occurring on the POI.
     * 
     */
    CHER,

    /**
     * Any kind of keyboard allowing all or part of the commands 	of the Input message request from the Sale System to the POI System (InputCommand data element). The output device attached to this input device is the CashierDisplay device.
     * 
     */
    CHIN,

    /**
     * To display to the Cashier a new state on which the POI is entering. 	For instance, during a payment, the POI could display to the Cashier that POI request an authorisation to the host acquirer.
     * 
     */
    CHST,

    /**
     * Standard Customer display interface used by the POI System to ask question, or to show information to the Customer inside a Service dialogue.
     * 
     */
    CUDI,

    /**
     * Input of the Cardholder POI interface which can be entered by the Cashier to assist the Customer.
     * 
     */
    CUAS,

    /**
     * To display to the Customer information is related to an error situation occurring on the Sale Terminal during a Sale transaction.
     * 
     */
    CUER,

    /**
     * Any kind of keyboard allowing all or part of the commands 	of the Input message request from the Sale System to the POI System (InputCommand data element).
     * 
     */
    CUIN,

    /**
     * Information displayed on the Cardholder POI interface, replicated on the Cashier interface.
     * 
     */
    POIR,

    /**
     * When the POI System wants to print specific document (check, dynamic currency conversion ...).
     * 
     */
    PRDC,

    /**
     * Printer for the Payment receipt.
     * 
     */
    PRRP,

    /**
     * Coupons, voucher or special ticket generated by the POI and to be printed. 
     * 
     */
    PRVC;

    public String value() {
        return name();
    }

    public static SaleCapabilities1Code fromValue(String v) {
        return valueOf(v);
    }

}