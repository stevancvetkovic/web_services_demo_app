/**
 * MetodeServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kuca;

public class MetodeServiceLocator extends org.apache.axis.client.Service implements kuca.MetodeService {

    public MetodeServiceLocator() {
    }


    public MetodeServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MetodeServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Metode
    private java.lang.String Metode_address = "http://localhost:8080/axis/services/Metode";

    public java.lang.String getMetodeAddress() {
        return Metode_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MetodeWSDDServiceName = "Metode";

    public java.lang.String getMetodeWSDDServiceName() {
        return MetodeWSDDServiceName;
    }

    public void setMetodeWSDDServiceName(java.lang.String name) {
        MetodeWSDDServiceName = name;
    }

    public kuca.Metode getMetode() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Metode_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMetode(endpoint);
    }

    public kuca.Metode getMetode(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            kuca.MetodeSoapBindingStub _stub = new kuca.MetodeSoapBindingStub(portAddress, this);
            _stub.setPortName(getMetodeWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMetodeEndpointAddress(java.lang.String address) {
        Metode_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (kuca.Metode.class.isAssignableFrom(serviceEndpointInterface)) {
                kuca.MetodeSoapBindingStub _stub = new kuca.MetodeSoapBindingStub(new java.net.URL(Metode_address), this);
                _stub.setPortName(getMetodeWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Metode".equals(inputPortName)) {
            return getMetode();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:kuca", "MetodeService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:kuca", "Metode"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Metode".equals(portName)) {
            setMetodeEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
