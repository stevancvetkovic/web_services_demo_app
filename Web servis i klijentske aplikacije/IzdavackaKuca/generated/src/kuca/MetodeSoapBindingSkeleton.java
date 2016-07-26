/**
 * MetodeSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kuca;

public class MetodeSoapBindingSkeleton implements kuca.Metode, org.apache.axis.wsdl.Skeleton {
    private kuca.Metode impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("vratiKnjige", _params, new javax.xml.namespace.QName("", "vratiKnjigeReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("urn:kuca", "ArrayOfKnjiga"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:kuca", "vratiKnjige"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("vratiKnjige") == null) {
            _myOperations.put("vratiKnjige", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("vratiKnjige")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("promeniKnjigu", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("urn:kuca", "promeniKnjigu"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("promeniKnjigu") == null) {
            _myOperations.put("promeniKnjigu", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("promeniKnjigu")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("NePostojiException");
        _fault.setQName(new javax.xml.namespace.QName("urn:kuca", "fault"));
        _fault.setClassName("kuca.NePostojiException");
        _fault.setXmlType(new javax.xml.namespace.QName("urn:kuca", "NePostojiException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("brisiKnjigu", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("urn:kuca", "brisiKnjigu"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("brisiKnjigu") == null) {
            _myOperations.put("brisiKnjigu", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("brisiKnjigu")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("NePostojiException");
        _fault.setQName(new javax.xml.namespace.QName("urn:kuca", "fault"));
        _fault.setClassName("kuca.NePostojiException");
        _fault.setXmlType(new javax.xml.namespace.QName("urn:kuca", "NePostojiException"));
        _oper.addFault(_fault);
    }

    public MetodeSoapBindingSkeleton() {
        this.impl = new kuca.MetodeSoapBindingImpl();
    }

    public MetodeSoapBindingSkeleton(kuca.Metode impl) {
        this.impl = impl;
    }
    public kuca.Knjiga[] vratiKnjige(java.lang.String in0) throws java.rmi.RemoteException
    {
        kuca.Knjiga[] ret = impl.vratiKnjige(in0);
        return ret;
    }

    public void promeniKnjigu(java.lang.String in0, int in1, java.lang.String in2, double in3) throws java.rmi.RemoteException, kuca.NePostojiException
    {
        impl.promeniKnjigu(in0, in1, in2, in3);
    }

    public void brisiKnjigu(java.lang.String in0) throws java.rmi.RemoteException, kuca.NePostojiException
    {
        impl.brisiKnjigu(in0);
    }

}
