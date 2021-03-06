//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.14 at 02:36:58 PM EEST 
//


package com.osf.romanvintonyak.WSDummy.AssessmentCatalog;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Root element for AssessmentCatalogQuery.  The extensions hold the original query if there was one for this Catalog Listing. 
 * 
 * <p>Java class for AssessmentCatalogType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentCatalogType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientId" type="{http://ns.hr-xml.org/2007-04-15}EntityIdType" minOccurs="0"/>
 *         &lt;element name="ProviderId" type="{http://ns.hr-xml.org/2007-04-15}EntityIdType" minOccurs="0"/>
 *         &lt;element name="CatalogQueryStatus">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Status">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Match Found"/>
 *                         &lt;enumeration value="No Match Found"/>
 *                         &lt;enumeration value="Error"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AssessmentPackage" type="{http://ns.hr-xml.org/2007-04-15}AssessmentPackageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.hr-xml.org/2007-04-15}UserArea" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentCatalogType", propOrder = {
    "clientId",
    "providerId",
    "catalogQueryStatus",
    "assessmentPackage",
    "userArea"
})
@XmlRootElement(name = "AssessmentCatalog")
public class AssessmentCatalogType {

    @XmlElement(name = "ClientId")
    protected EntityIdType clientId;
    @XmlElement(name = "ProviderId")
    protected EntityIdType providerId;
    @XmlElement(name = "CatalogQueryStatus", required = true)
    protected AssessmentCatalogType.CatalogQueryStatus catalogQueryStatus;
    @XmlElement(name = "AssessmentPackage")
    protected List<AssessmentPackageType> assessmentPackage;
    @XmlElement(name = "UserArea1")
    protected UserAreaType userArea;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdType }
     *     
     */
    public EntityIdType getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdType }
     *     
     */
    public void setClientId(EntityIdType value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the providerId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdType }
     *     
     */
    public EntityIdType getProviderId() {
        return providerId;
    }

    /**
     * Sets the value of the providerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdType }
     *     
     */
    public void setProviderId(EntityIdType value) {
        this.providerId = value;
    }

    /**
     * Gets the value of the catalogQueryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentCatalogType.CatalogQueryStatus }
     *     
     */
    public AssessmentCatalogType.CatalogQueryStatus getCatalogQueryStatus() {
        return catalogQueryStatus;
    }

    /**
     * Sets the value of the catalogQueryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentCatalogType.CatalogQueryStatus }
     *     
     */
    public void setCatalogQueryStatus(AssessmentCatalogType.CatalogQueryStatus value) {
        this.catalogQueryStatus = value;
    }

    /**
     * Gets the value of the assessmentPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssessmentPackageType }
     * 
     * 
     */
    public List<AssessmentPackageType> getAssessmentPackage() {
        if (assessmentPackage == null) {
            assessmentPackage = new ArrayList<AssessmentPackageType>();
        }
        return this.assessmentPackage;
    }

    /**
     * Gets the value of the userArea property.
     * 
     * @return
     *     possible object is
     *     {@link UserAreaType }
     *     
     */
    public UserAreaType getUserArea() {
        return userArea;
    }

    /**
     * Sets the value of the userArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAreaType }
     *     
     */
    public void setUserArea(UserAreaType value) {
        this.userArea = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
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
     *         &lt;element name="Status">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Match Found"/>
     *               &lt;enumeration value="No Match Found"/>
     *               &lt;enumeration value="Error"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "status",
        "details"
    })
    public static class CatalogQueryStatus {

        @XmlElement(name = "Status", required = true)
        protected String status;
        @XmlElement(name = "Details")
        protected String details;

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the details property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDetails() {
            return details;
        }

        /**
         * Sets the value of the details property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDetails(String value) {
            this.details = value;
        }

    }
    

}
