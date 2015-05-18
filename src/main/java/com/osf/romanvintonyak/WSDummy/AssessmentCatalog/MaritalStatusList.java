//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.14 at 02:36:58 PM EEST 
//


package com.osf.romanvintonyak.WSDummy.AssessmentCatalog;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaritalStatusList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaritalStatusList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Domestic Partner"/>
 *     &lt;enumeration value="Divorced"/>
 *     &lt;enumeration value="Married"/>
 *     &lt;enumeration value="Unreported"/>
 *     &lt;enumeration value="Separated"/>
 *     &lt;enumeration value="Unmarried"/>
 *     &lt;enumeration value="Widowed"/>
 *     &lt;enumeration value="Legally Separated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaritalStatusList")
@XmlEnum
public enum MaritalStatusList {

    @XmlEnumValue("Domestic Partner")
    DOMESTIC_PARTNER("Domestic Partner"),
    @XmlEnumValue("Divorced")
    DIVORCED("Divorced"),
    @XmlEnumValue("Married")
    MARRIED("Married"),
    @XmlEnumValue("Unreported")
    UNREPORTED("Unreported"),
    @XmlEnumValue("Separated")
    SEPARATED("Separated"),
    @XmlEnumValue("Unmarried")
    UNMARRIED("Unmarried"),
    @XmlEnumValue("Widowed")
    WIDOWED("Widowed"),
    @XmlEnumValue("Legally Separated")
    LEGALLY_SEPARATED("Legally Separated");
    private final String value;

    MaritalStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaritalStatusList fromValue(String v) {
        for (MaritalStatusList c: MaritalStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
