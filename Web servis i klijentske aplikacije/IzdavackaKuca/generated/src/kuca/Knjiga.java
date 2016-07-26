/**
 * Knjiga.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kuca;

public class Knjiga  implements java.io.Serializable {
    private java.lang.String ISBN;

    private int brojKnjiga;

    private int brojStrana;

    private java.lang.String naslov;

    private double ocena;

    private java.lang.String opis;

    public Knjiga() {
    }

    public Knjiga(
           java.lang.String ISBN,
           int brojKnjiga,
           int brojStrana,
           java.lang.String naslov,
           double ocena,
           java.lang.String opis) {
           this.ISBN = ISBN;
           this.brojKnjiga = brojKnjiga;
           this.brojStrana = brojStrana;
           this.naslov = naslov;
           this.ocena = ocena;
           this.opis = opis;
    }


    /**
     * Gets the ISBN value for this Knjiga.
     * 
     * @return ISBN
     */
    public java.lang.String getISBN() {
        return ISBN;
    }


    /**
     * Sets the ISBN value for this Knjiga.
     * 
     * @param ISBN
     */
    public void setISBN(java.lang.String ISBN) {
        this.ISBN = ISBN;
    }


    /**
     * Gets the brojKnjiga value for this Knjiga.
     * 
     * @return brojKnjiga
     */
    public int getBrojKnjiga() {
        return brojKnjiga;
    }


    /**
     * Sets the brojKnjiga value for this Knjiga.
     * 
     * @param brojKnjiga
     */
    public void setBrojKnjiga(int brojKnjiga) {
        this.brojKnjiga = brojKnjiga;
    }


    /**
     * Gets the brojStrana value for this Knjiga.
     * 
     * @return brojStrana
     */
    public int getBrojStrana() {
        return brojStrana;
    }


    /**
     * Sets the brojStrana value for this Knjiga.
     * 
     * @param brojStrana
     */
    public void setBrojStrana(int brojStrana) {
        this.brojStrana = brojStrana;
    }


    /**
     * Gets the naslov value for this Knjiga.
     * 
     * @return naslov
     */
    public java.lang.String getNaslov() {
        return naslov;
    }


    /**
     * Sets the naslov value for this Knjiga.
     * 
     * @param naslov
     */
    public void setNaslov(java.lang.String naslov) {
        this.naslov = naslov;
    }


    /**
     * Gets the ocena value for this Knjiga.
     * 
     * @return ocena
     */
    public double getOcena() {
        return ocena;
    }


    /**
     * Sets the ocena value for this Knjiga.
     * 
     * @param ocena
     */
    public void setOcena(double ocena) {
        this.ocena = ocena;
    }


    /**
     * Gets the opis value for this Knjiga.
     * 
     * @return opis
     */
    public java.lang.String getOpis() {
        return opis;
    }


    /**
     * Sets the opis value for this Knjiga.
     * 
     * @param opis
     */
    public void setOpis(java.lang.String opis) {
        this.opis = opis;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Knjiga)) return false;
        Knjiga other = (Knjiga) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ISBN==null && other.getISBN()==null) || 
             (this.ISBN!=null &&
              this.ISBN.equals(other.getISBN()))) &&
            this.brojKnjiga == other.getBrojKnjiga() &&
            this.brojStrana == other.getBrojStrana() &&
            ((this.naslov==null && other.getNaslov()==null) || 
             (this.naslov!=null &&
              this.naslov.equals(other.getNaslov()))) &&
            this.ocena == other.getOcena() &&
            ((this.opis==null && other.getOpis()==null) || 
             (this.opis!=null &&
              this.opis.equals(other.getOpis())));
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
        if (getISBN() != null) {
            _hashCode += getISBN().hashCode();
        }
        _hashCode += getBrojKnjiga();
        _hashCode += getBrojStrana();
        if (getNaslov() != null) {
            _hashCode += getNaslov().hashCode();
        }
        _hashCode += new Double(getOcena()).hashCode();
        if (getOpis() != null) {
            _hashCode += getOpis().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Knjiga.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:kuca", "Knjiga"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISBN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ISBN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brojKnjiga");
        elemField.setXmlName(new javax.xml.namespace.QName("", "brojKnjiga"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brojStrana");
        elemField.setXmlName(new javax.xml.namespace.QName("", "brojStrana"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naslov");
        elemField.setXmlName(new javax.xml.namespace.QName("", "naslov"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocena");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ocena"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
