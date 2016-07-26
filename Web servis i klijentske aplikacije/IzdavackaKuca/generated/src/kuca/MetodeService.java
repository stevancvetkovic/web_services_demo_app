/**
 * MetodeService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kuca;

public interface MetodeService extends javax.xml.rpc.Service {
    public java.lang.String getMetodeAddress();

    public kuca.Metode getMetode() throws javax.xml.rpc.ServiceException;

    public kuca.Metode getMetode(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
