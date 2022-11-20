
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies two values to compare for a benchmark curve name.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompareBenchmarkCurveName3", propOrder = {
    "val1",
    "val2"
})
public class CompareBenchmarkCurveName3 {

    @XmlElement(name = "Val1")
    protected BenchmarkCurveName10Choice val1;
    @XmlElement(name = "Val2")
    protected BenchmarkCurveName10Choice val2;

    /**
     * Gets the value of the val1 property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurveName10Choice }
     *     
     */
    public BenchmarkCurveName10Choice getVal1() {
        return val1;
    }

    /**
     * Sets the value of the val1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurveName10Choice }
     *     
     */
    public CompareBenchmarkCurveName3 setVal1(BenchmarkCurveName10Choice value) {
        this.val1 = value;
        return this;
    }

    /**
     * Gets the value of the val2 property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurveName10Choice }
     *     
     */
    public BenchmarkCurveName10Choice getVal2() {
        return val2;
    }

    /**
     * Sets the value of the val2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurveName10Choice }
     *     
     */
    public CompareBenchmarkCurveName3 setVal2(BenchmarkCurveName10Choice value) {
        this.val2 = value;
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