//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NAMEGIVERWEAPONSIZERESTRICTION_type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NAMEGIVERWEAPONSIZERESTRICTION_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="onehandmin" type="{http://earthdawn.com/datatypes}unsigned_int" default="1" /&gt;
 *       &lt;attribute name="onehandmax" type="{http://earthdawn.com/datatypes}unsigned_int" default="3" /&gt;
 *       &lt;attribute name="twohandmin" type="{http://earthdawn.com/datatypes}unsigned_int" default="4" /&gt;
 *       &lt;attribute name="twohandmax" type="{http://earthdawn.com/datatypes}unsigned_int" default="6" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAMEGIVERWEAPONSIZERESTRICTION_type", namespace = "http://earthdawn.com/namegiver")
public class NAMEGIVERWEAPONSIZERESTRICTIONType {

    @XmlAttribute(name = "onehandmin")
    protected Integer onehandmin;
    @XmlAttribute(name = "onehandmax")
    protected Integer onehandmax;
    @XmlAttribute(name = "twohandmin")
    protected Integer twohandmin;
    @XmlAttribute(name = "twohandmax")
    protected Integer twohandmax;

    /**
     * Gets the value of the onehandmin property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getOnehandmin() {
        if (onehandmin == null) {
            return  1;
        } else {
            return onehandmin;
        }
    }

    /**
     * Sets the value of the onehandmin property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setOnehandmin(Integer value) {
        this.onehandmin = value;
    }

    /**
     * Gets the value of the onehandmax property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getOnehandmax() {
        if (onehandmax == null) {
            return  3;
        } else {
            return onehandmax;
        }
    }

    /**
     * Sets the value of the onehandmax property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setOnehandmax(Integer value) {
        this.onehandmax = value;
    }

    /**
     * Gets the value of the twohandmin property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getTwohandmin() {
        if (twohandmin == null) {
            return  4;
        } else {
            return twohandmin;
        }
    }

    /**
     * Sets the value of the twohandmin property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTwohandmin(Integer value) {
        this.twohandmin = value;
    }

    /**
     * Gets the value of the twohandmax property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getTwohandmax() {
        if (twohandmax == null) {
            return  6;
        } else {
            return twohandmax;
        }
    }

    /**
     * Sets the value of the twohandmax property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTwohandmax(Integer value) {
        this.twohandmax = value;
    }

}