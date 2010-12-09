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
 * <p>Java class for RECOVERY_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RECOVERY_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="testsperday" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *       &lt;attribute name="step" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *       &lt;attribute name="dice" type="{http://earthdawn.com/datatypes}dice_type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RECOVERY_type")
public class RECOVERYType {

    @XmlAttribute(required = true)
    protected int testsperday;
    @XmlAttribute(required = true)
    protected int step;
    @XmlAttribute
    protected DiceType dice;

    /**
     * Gets the value of the testsperday property.
     * 
     */
    public int getTestsperday() {
        return testsperday;
    }

    /**
     * Sets the value of the testsperday property.
     * 
     */
    public void setTestsperday(int value) {
        this.testsperday = value;
    }

    /**
     * Gets the value of the step property.
     * 
     */
    public int getStep() {
        return step;
    }

    /**
     * Sets the value of the step property.
     * 
     */
    public void setStep(int value) {
        this.step = value;
    }

    /**
     * Gets the value of the dice property.
     * 
     * @return
     *     possible object is
     *     {@link DiceType }
     *     
     */
    public DiceType getDice() {
        return dice;
    }

    /**
     * Sets the value of the dice property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiceType }
     *     
     */
    public void setDice(DiceType value) {
        this.dice = value;
    }

}
