//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CALCULATEDLEGENDPOINTADJUSTMENT_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CALCULATEDLEGENDPOINTADJUSTMENT_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" use="required" type="{http://earthdawn.com/character}CALCULATEDLEGENDPOINTADJUSTMENTTYPE_type" />
 *       &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CALCULATEDLEGENDPOINTADJUSTMENT_type", namespace = "http://earthdawn.com/character")
public class CALCULATEDLEGENDPOINTADJUSTMENTType {

    @XmlAttribute(required = true)
    protected CALCULATEDLEGENDPOINTADJUSTMENTTYPEType type;
    @XmlAttribute
    protected String reason;
    @XmlAttribute
    protected Integer value;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CALCULATEDLEGENDPOINTADJUSTMENTTYPEType }
     *     
     */
    public CALCULATEDLEGENDPOINTADJUSTMENTTYPEType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CALCULATEDLEGENDPOINTADJUSTMENTTYPEType }
     *     
     */
    public void setType(CALCULATEDLEGENDPOINTADJUSTMENTTYPEType value) {
        this.type = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        if (reason == null) {
            return "";
        } else {
            return reason;
        }
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getValue() {
        if (value == null) {
            return  0;
        } else {
            return value;
        }
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValue(Integer value) {
        this.value = value;
    }

}
