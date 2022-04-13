/**
 * Compte.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class Compte  implements java.io.Serializable {
    private long code;

    private java.util.Calendar datecreation;

    private double solde;

    public Compte() {
    }

    public Compte(
           long code,
           java.util.Calendar datecreation,
           double solde) {
           this.code = code;
           this.datecreation = datecreation;
           this.solde = solde;
    }


    /**
     * Gets the code value for this Compte.
     * 
     * @return code
     */
    public long getCode() {
        return code;
    }


    /**
     * Sets the code value for this Compte.
     * 
     * @param code
     */
    public void setCode(long code) {
        this.code = code;
    }


    /**
     * Gets the datecreation value for this Compte.
     * 
     * @return datecreation
     */
    public java.util.Calendar getDatecreation() {
        return datecreation;
    }


    /**
     * Sets the datecreation value for this Compte.
     * 
     * @param datecreation
     */
    public void setDatecreation(java.util.Calendar datecreation) {
        this.datecreation = datecreation;
    }


    /**
     * Gets the solde value for this Compte.
     * 
     * @return solde
     */
    public double getSolde() {
        return solde;
    }


    /**
     * Sets the solde value for this Compte.
     * 
     * @param solde
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Compte)) return false;
        Compte other = (Compte) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.code == other.getCode() &&
            ((this.datecreation==null && other.getDatecreation()==null) || 
             (this.datecreation!=null &&
              this.datecreation.equals(other.getDatecreation()))) &&
            this.solde == other.getSolde();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getCode()).hashCode();
        if (getDatecreation() != null) {
            _hashCode += getDatecreation().hashCode();
        }
        _hashCode += new Double(getSolde()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Compte.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "compte"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datecreation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datecreation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "solde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
