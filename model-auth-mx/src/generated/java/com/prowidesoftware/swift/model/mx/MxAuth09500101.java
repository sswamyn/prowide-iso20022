
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for auth.095.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mnyMktFndAuthstnRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:esma:xsd:DRAFT1auth.095.001.01")
public class MxAuth09500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MnyMktFndAuthstnRpt", required = true)
    protected MoneyMarketFundAuthorisationReportV01 mnyMktFndAuthstnRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 95;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {DatePeriod3 .class, FinancialInstrumentAttributes100 .class, FundAuthorisationUpdate1 .class, FundReportCancellation1 .class, GenericIdentification13 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, LegalFramework2Code.class, LegalFramework5Choice.class, MoneyMarketFundAuthorisationReport1Choice.class, MoneyMarketFundAuthorisationReportV01 .class, MoneyMarketFundType1Choice.class, MoneyMarketFundType1Code.class, MxAuth09500101 .class, OrganisationIdentificationSchemeName1Choice.class, PartyIdentification194 .class, PartyIdentification196 .class, SecurityIdentification31Choice.class, SupervisingAuthorityIdentification1 .class, SupervisingAuthorityIdentification1Choice.class, UpdateLogOrganisationIdentification1 .class };
    public final static transient String NAMESPACE = "urn:esma:xsd:DRAFT1auth.095.001.01";

    public MxAuth09500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth09500101(final String xml) {
        this();
        MxAuth09500101 tmp = parse(xml);
        mnyMktFndAuthstnRpt = tmp.getMnyMktFndAuthstnRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth09500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mnyMktFndAuthstnRpt property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyMarketFundAuthorisationReportV01 }
     *     
     */
    public MoneyMarketFundAuthorisationReportV01 getMnyMktFndAuthstnRpt() {
        return mnyMktFndAuthstnRpt;
    }

    /**
     * Sets the value of the mnyMktFndAuthstnRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyMarketFundAuthorisationReportV01 }
     *     
     */
    public MxAuth09500101 setMnyMktFndAuthstnRpt(MoneyMarketFundAuthorisationReportV01 value) {
        this.mnyMktFndAuthstnRpt = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxAuth09500101 parse(String xml) {
        return ((MxAuth09500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth09500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth09500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth09500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth09500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth09500101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth09500101) parserImpl.read(MxAuth09500101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxAuth09500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth09500101 message
     * @return
     *     a new instance of MxAuth09500101
     */
    public final static MxAuth09500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth09500101 .class);
    }

}
