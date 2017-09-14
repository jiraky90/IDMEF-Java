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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for action-category.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="action-category">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="block-installed"/>
 *     &lt;enumeration value="notification-sent"/>
 *     &lt;enumeration value="taken-offline"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "action-category")
@XmlEnum
public enum ActionCategory implements Serializable {

    @XmlEnumValue("block-installed")
    BLOCK_INSTALLED("block-installed"),
    @XmlEnumValue("notification-sent")
    NOTIFICATION_SENT("notification-sent"),
    @XmlEnumValue("taken-offline")
    TAKEN_OFFLINE("taken-offline"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ActionCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionCategory fromValue(String v) {
        for (ActionCategory c: ActionCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
