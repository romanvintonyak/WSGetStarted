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
 * <p>Java class for PersonHairColorQualifiers.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonHairColorQualifiers">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bald"/>
 *     &lt;enumeration value="Brown"/>
 *     &lt;enumeration value="White"/>
 *     &lt;enumeration value="Blonde"/>
 *     &lt;enumeration value="Gray"/>
 *     &lt;enumeration value="Red"/>
 *     &lt;enumeration value="Auburn"/>
 *     &lt;enumeration value="Black"/>
 *     &lt;enumeration value="Silver"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonHairColorQualifiers")
@XmlEnum
public enum PersonHairColorQualifiers {

    @XmlEnumValue("Bald")
    BALD("Bald"),
    @XmlEnumValue("Brown")
    BROWN("Brown"),
    @XmlEnumValue("White")
    WHITE("White"),
    @XmlEnumValue("Blonde")
    BLONDE("Blonde"),
    @XmlEnumValue("Gray")
    GRAY("Gray"),
    @XmlEnumValue("Red")
    RED("Red"),
    @XmlEnumValue("Auburn")
    AUBURN("Auburn"),
    @XmlEnumValue("Black")
    BLACK("Black"),
    @XmlEnumValue("Silver")
    SILVER("Silver"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    PersonHairColorQualifiers(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonHairColorQualifiers fromValue(String v) {
        for (PersonHairColorQualifiers c: PersonHairColorQualifiers.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
