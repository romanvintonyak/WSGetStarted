//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.14 at 02:36:11 PM EEST 
//


package com.osf.romanvintonyak.WSDummy.AssessmentCatalogQuery;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The FilterType contains either a FilterString or collection of SimpleExpressions to filter a catalog query.
 * 
 * <p>Java class for FilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="FilterString">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Type" type="{http://ns.hr-xml.org/2007-04-15}FilterStringTypeType"/>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SimpleExpression" type="{http://ns.hr-xml.org/2007-04-15}SimpleExpressionType" maxOccurs="unbounded"/>
 *         &lt;element name="Unfiltered">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="true"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterType", propOrder = {
    "filterString",
    "simpleExpression",
    "unfiltered"
})
public class FilterType {

    @XmlElement(name = "FilterString")
    protected FilterType.FilterString filterString;
    @XmlElement(name = "SimpleExpression")
    protected List<SimpleExpressionType> simpleExpression;
    @XmlElement(name = "Unfiltered")
    protected String unfiltered;

    /**
     * Gets the value of the filterString property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType.FilterString }
     *     
     */
    public FilterType.FilterString getFilterString() {
        return filterString;
    }

    /**
     * Sets the value of the filterString property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType.FilterString }
     *     
     */
    public void setFilterString(FilterType.FilterString value) {
        this.filterString = value;
    }

    /**
     * Gets the value of the simpleExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleExpressionType }
     * 
     * 
     */
    public List<SimpleExpressionType> getSimpleExpression() {
        if (simpleExpression == null) {
            simpleExpression = new ArrayList<SimpleExpressionType>();
        }
        return this.simpleExpression;
    }

    /**
     * Gets the value of the unfiltered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnfiltered() {
        return unfiltered;
    }

    /**
     * Sets the value of the unfiltered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnfiltered(String value) {
        this.unfiltered = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Type" type="{http://ns.hr-xml.org/2007-04-15}FilterStringTypeType"/>
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "type",
        "value"
    })
    public static class FilterString {

        @XmlElement(name = "Type", required = true)
        protected FilterStringTypeType type;
        @XmlElement(name = "Value", required = true)
        protected String value;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link FilterStringTypeType }
         *     
         */
        public FilterStringTypeType getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link FilterStringTypeType }
         *     
         */
        public void setType(FilterStringTypeType value) {
            this.type = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
