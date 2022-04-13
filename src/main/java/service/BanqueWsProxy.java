package service;

public class BanqueWsProxy implements service.BanqueWs {
  private String _endpoint = null;
  private service.BanqueWs banqueWs = null;
  
  public BanqueWsProxy() {
    _initBanqueWsProxy();
  }
  
  public BanqueWsProxy(String endpoint) {
    _endpoint = endpoint;
    _initBanqueWsProxy();
  }
  
  private void _initBanqueWsProxy() {
    try {
      banqueWs = (new service.BanqueServiceServiceLocator()).getBanqueWsPort();
      if (banqueWs != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)banqueWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)banqueWs)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (banqueWs != null)
      ((javax.xml.rpc.Stub)banqueWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.BanqueWs getBanqueWs() {
    if (banqueWs == null)
      _initBanqueWsProxy();
    return banqueWs;
  }
  
  public double conversionEuroToDh(double monatant) throws java.rmi.RemoteException{
    if (banqueWs == null)
      _initBanqueWsProxy();
    return banqueWs.conversionEuroToDh(monatant);
  }
  
  public service.Compte getcompte(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (banqueWs == null)
      _initBanqueWsProxy();
    return banqueWs.getcompte(arg0);
  }
  
  public service.Compte[] getComptes() throws java.rmi.RemoteException{
    if (banqueWs == null)
      _initBanqueWsProxy();
    return banqueWs.getComptes();
  }
  
  
}