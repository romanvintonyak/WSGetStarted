//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.14 at 02:36:58 PM EEST 
//


package com.osf.romanvintonyak.WSDummy.AssessmentCatalog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FlexibleDatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlexibleDatesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AnyDate" type="{http://ns.hr-xml.org/2007-04-15}AnyDateTimeNkNaType"/>
 *         &lt;element name="YearMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
 *         &lt;element name="MonthDay" type="{http://www.w3.org/2001/XMLSchema}gMonthDay"/>
 *         &lt;element name="StringDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *       &lt;attribute name="dateDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexibleDatesType", propOrder = {
    "anyDate",
    "yearMonth",
    "year",
    "monthDay",
    "stringDate"
})
public class FlexibleDatesType {

    @XmlElement(name = "AnyDate")
    protected String anyDate;
    @XmlElement(name = "YearMonth")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar yearMonth;
    @XmlElement(name = "Year")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar year;
    @XmlElement(name = "MonthDay")
    @XmlSchemaType(name = "gMonthDay")
    protected XMLGregorianCalendar monthDay;
    @XmlElement(name = "StringDate")
    protected String stringDate;
    @XmlAttribute(name = "dateDescription")
    protected String dateDescription;

    /**
     * Gets the value of the anyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnyDate() {
        return anyDate;
    }

    /**
     * Sets the value of the anyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnyDate(String value) {
        this.anyDate = value;
    }

    /**
     * Gets the value of the yearMonth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearMonth() {
        return yearMonth;
    }

    /**
     * Sets the value of the yearMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearMonth(XMLGregorianCalendar value) {
        this.yearMonth = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYear(XMLGregorianCalendar value) {
        this.year = value;
    }

    /**
     * Gets the value of the monthDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMonthDay() {
        return monthDay;
    }

    /**
     * Sets the value of the monthDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMonthDay(XMLGregorianCalendar value) {
        this.monthDay = value;
    }

    /**
     * Gets the value of the stringDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringDate() {
        return stringDate;
    }

    /**
     * Sets the value of the stringDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringDate(String value) {
        this.stringDate = value;
    }

    /**
     * Gets the value of the dateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDescription() {
        return dateDescription;
    }

    /**
     * Sets the value of the dateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDescription(String value) {
        this.dateDescription = value;
    }

}
