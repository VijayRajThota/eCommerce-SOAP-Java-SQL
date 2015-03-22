/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connection;

public interface Service extends java.rmi.Remote {
    public user.Quantity amount(java.lang.String brand) throws java.rmi.RemoteException;
    public int confirm(int confno) throws java.rmi.RemoteException;
    public java.lang.String entry(int cid, java.lang.String cname, java.lang.String cnumber, java.lang.String caddress, java.lang.String cvv) throws java.rmi.RemoteException;
    public user.Quantity increment(java.lang.String brand, java.lang.String count) throws java.rmi.RemoteException;
    public java.lang.String signUp(int membershipId, java.lang.String firstname, java.lang.String lastname, java.lang.String emailId, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public user.User signin(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public user.Confirmation delivery(int confno) throws java.rmi.RemoteException;
}
