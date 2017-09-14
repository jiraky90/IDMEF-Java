/**
 * IDMEF Package for JAVA
 *
 * @author Mattia Zago - dev [at] zagomattia [dot] it
 * @version 0.0.1
 * @since 14/09/2017
 * 
 * License Notice
 * 
 *   This file is subject to the terms and conditions defined in
 *   file 'LICENSE.txt', which is part of this source code package.
 * 
 * Copyright Notice
 *
 *   Edits and bug-fixes:
 *     Copyright (c) 2017 Mattia Zago. All rights reserved.
 *
 *   Auto-generated files:
 *     This file was generated by the JavaTM Architecture for XML Binding(JAXB)
 *     Reference Implementation, v2.2.8-b130911.1802 
 *     See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
 *
 *   IDMEF Schema:
 *     Copyright (c) 2008 IETF Trust and the persons identified as the
 *     IDMEF document authors.  All rights reserved.
 *     See https://tools.ietf.org/html/bcp78 for the complete license 
 *     document.
 */

package org.iana.idmef;
import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TimeWithNtpstamp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeWithNtpstamp">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>dateTime">
 *       &lt;attribute name="ntpstamp" use="required" type="{http://iana.org/idmef}ntpstamp" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeWithNtpstamp", propOrder = {
    "value"
})
public class TimeWithNtpstamp implements Serializable {

    /**
     * Generated Serial Version UID.
     */
    private static final long serialVersionUID = 8600838927728665428L;
    @XmlValue
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar value;
    @XmlAttribute(name = "ntpstamp", required = true)
    protected String ntpstamp;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

    /**
     * Gets the value of the ntpstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpstamp() {
        return ntpstamp;
    }

    /**
     * Sets the value of the ntpstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpstamp(String value) {
        this.ntpstamp = value;
    }
    
    /**
     * Decode the XML ISO-8601 compliant date to standard Date object.
     * @return Date in ISO format.
     */
    public Date getValueAsDateTime() {
        return this.getValue().toGregorianCalendar().getTime();
    }

}
