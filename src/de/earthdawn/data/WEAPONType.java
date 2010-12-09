//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.09 at 08:12:32 PM MEZ 
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WEAPON_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WEAPON_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://earthdawn.com/datatypes}ITEM_type">
 *       &lt;attribute name="damagestep" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *       &lt;attribute name="strengthmin" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *       &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="timesforged" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="shortrange" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="mediumrange" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="longrange" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WEAPON_type")
public class WEAPONType
    extends ITEMType
{

    @XmlAttribute(required = true)
    protected int damagestep;
    @XmlAttribute(required = true)
    protected int strengthmin;
    @XmlAttribute(required = true)
    protected int size;
    @XmlAttribute
    protected Integer timesforged;
    @XmlAttribute
    protected Integer shortrange;
    @XmlAttribute
    protected Integer mediumrange;
    @XmlAttribute
    protected Integer longrange;

    /**
     * Gets the value of the damagestep property.
     * 
     */
    public int getDamagestep() {
        return damagestep;
    }

    /**
     * Sets the value of the damagestep property.
     * 
     */
    public void setDamagestep(int value) {
        this.damagestep = value;
    }

    /**
     * Gets the value of the strengthmin property.
     * 
     */
    public int getStrengthmin() {
        return strengthmin;
    }

    /**
     * Sets the value of the strengthmin property.
     * 
     */
    public void setStrengthmin(int value) {
        this.strengthmin = value;
    }

    /**
     * Gets the value of the size property.
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(int value) {
        this.size = value;
    }

    /**
     * Gets the value of the timesforged property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getTimesforged() {
        if (timesforged == null) {
            return  0;
        } else {
            return timesforged;
        }
    }

    /**
     * Sets the value of the timesforged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimesforged(Integer value) {
        this.timesforged = value;
    }

    /**
     * Gets the value of the shortrange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getShortrange() {
        if (shortrange == null) {
            return  0;
        } else {
            return shortrange;
        }
    }

    /**
     * Sets the value of the shortrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShortrange(Integer value) {
        this.shortrange = value;
    }

    /**
     * Gets the value of the mediumrange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMediumrange() {
        if (mediumrange == null) {
            return  0;
        } else {
            return mediumrange;
        }
    }

    /**
     * Sets the value of the mediumrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMediumrange(Integer value) {
        this.mediumrange = value;
    }

    /**
     * Gets the value of the longrange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLongrange() {
        if (longrange == null) {
            return  0;
        } else {
            return longrange;
        }
    }

    /**
     * Sets the value of the longrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLongrange(Integer value) {
        this.longrange = value;
    }

}
