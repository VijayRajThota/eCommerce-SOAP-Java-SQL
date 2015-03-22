/**
 * Confirmation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package user;

public class Confirmation  implements java.io.Serializable {
    private java.util.Calendar confdate;

    private int confno;

    private java.util.Calendar ddate;

    public Confirmation() {
    }

    public Confirmation(
           java.util.Calendar confdate,
           int confno,
           java.util.Calendar ddate) {
           this.confdate = confdate;
           this.confno = confno;
           this.ddate = ddate;
    }


    /**
     * Gets the confdate value for this Confirmation.
     * 
     * @return confdate
     */
    public java.util.Calendar getConfdate() {
        return confdate;
    }


    /**
     * Sets the confdate value for this Confirmation.
     * 
     * @param confdate
     */
    public void setConfdate(java.util.Calendar confdate) {
        this.confdate = confdate;
    }


    /**
     * Gets the confno value for this Confirmation.
     * 
     * @return confno
     */
    public int getConfno() {
        return confno;
    }


    /**
     * Sets the confno value for this Confirmation.
     * 
     * @param confno
     */
    public void setConfno(int confno) {
        this.confno = confno;
    }


    /**
     * Gets the ddate value for this Confirmation.
     * 
     * @return ddate
     */
    public java.util.Calendar getDdate() {
        return ddate;
    }


    /**
     * Sets the ddate value for this Confirmation.
     * 
     * @param ddate
     */
    public void setDdate(java.util.Calendar ddate) {
        this.ddate = ddate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Confirmation)) return false;
        Confirmation other = (Confirmation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.confdate==null && other.getConfdate()==null) || 
             (this.confdate!=null &&
              this.confdate.equals(other.getConfdate()))) &&
            this.confno == other.getConfno() &&
            ((this.ddate==null && other.getDdate()==null) || 
             (this.ddate!=null &&
              this.ddate.equals(other.getDdate())));
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
        if (getConfdate() != null) {
            _hashCode += getConfdate().hashCode();
        }
        _hashCode += getConfno();
        if (getDdate() != null) {
            _hashCode += getDdate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Confirmation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://user", "Confirmation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://user", "confdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://user", "confno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ddate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://user", "ddate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
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
