/**
 * BanqueServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class BanqueServiceServiceLocator extends org.apache.axis.client.Service implements service.BanqueServiceService {

    public BanqueServiceServiceLocator() {
    }


    public BanqueServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BanqueServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BanqueWsPort
    private java.lang.String BanqueWsPort_address = "http://localhost:8585/";

    public java.lang.String getBanqueWsPortAddress() {
        return BanqueWsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BanqueWsPortWSDDServiceName = "BanqueWsPort";

    public java.lang.String getBanqueWsPortWSDDServiceName() {
        return BanqueWsPortWSDDServiceName;
    }

    public void setBanqueWsPortWSDDServiceName(java.lang.String name) {
        BanqueWsPortWSDDServiceName = name;
    }

    public service.BanqueWs getBanqueWsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BanqueWsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBanqueWsPort(endpoint);
    }

    public service.BanqueWs getBanqueWsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            service.BanqueWsPortBindingStub _stub = new service.BanqueWsPortBindingStub(portAddress, this);
            _stub.setPortName(getBanqueWsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBanqueWsPortEndpointAddress(java.lang.String address) {
        BanqueWsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (service.BanqueWs.class.isAssignableFrom(serviceEndpointInterface)) {
                service.BanqueWsPortBindingStub _stub = new service.BanqueWsPortBindingStub(new java.net.URL(BanqueWsPort_address), this);
                _stub.setPortName(getBanqueWsPortWSDDServiceName());
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
        if ("BanqueWsPort".equals(inputPortName)) {
            return getBanqueWsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "BanqueServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "BanqueWsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BanqueWsPort".equals(portName)) {
            setBanqueWsPortEndpointAddress(address);
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
