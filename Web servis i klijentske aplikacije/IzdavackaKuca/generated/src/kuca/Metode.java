/**
 * Metode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kuca;

public interface Metode extends java.rmi.Remote {
    public kuca.Knjiga[] vratiKnjige(java.lang.String in0) throws java.rmi.RemoteException;
    public void promeniKnjigu(java.lang.String in0, int in1, java.lang.String in2, double in3) throws java.rmi.RemoteException, kuca.NePostojiException;
    public void brisiKnjigu(java.lang.String in0) throws java.rmi.RemoteException, kuca.NePostojiException;
}
