package connection;

public class ServiceProxy implements connection.Service {
  private String _endpoint = null;
  private connection.Service service = null;
  
  public ServiceProxy() {
    _initServiceProxy();
  }
  
  public ServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceProxy();
  }
  
  private void _initServiceProxy() {
    try {
      service = (new connection.ServiceServiceLocator()).getService();
      if (service != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)service)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (service != null)
      ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public connection.Service getService() {
    if (service == null)
      _initServiceProxy();
    return service;
  }
  
  public user.Quantity amount(java.lang.String brand) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.amount(brand);
  }
  
  public int confirm(int confno) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.confirm(confno);
  }
  
  public java.lang.String entry(int cid, java.lang.String cname, java.lang.String cnumber, java.lang.String caddress, java.lang.String cvv) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.entry(cid, cname, cnumber, caddress, cvv);
  }
  
  public user.Quantity increment(java.lang.String brand, java.lang.String count) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.increment(brand, count);
  }
  
  public java.lang.String signUp(int membershipId, java.lang.String firstname, java.lang.String lastname, java.lang.String emailId, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.signUp(membershipId, firstname, lastname, emailId, username, password);
  }
  
  public user.User signin(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.signin(username, password);
  }
  
  public user.Confirmation delivery(int confno) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.delivery(confno);
  }
  
  
}