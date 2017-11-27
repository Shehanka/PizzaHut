package com.chamodshehanka.pizzaHutClient.proxy;

import com.chamodshehanka.pizzaHutCommon.service.ServiceFactory;
import com.chamodshehanka.pizzaHutCommon.service.SuperService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class ProxyHandler implements ServiceFactory{

    private static ProxyHandler proxyHandler;
    private ServiceFactory serviceFactory;

    private ProxyHandler() throws RemoteException, NotBoundException, MalformedURLException {
        serviceFactory = (ServiceFactory) Naming.lookup("rmi://localhost:5050/PizzaServer");
    }

    public static ProxyHandler getInstance() throws RemoteException, NotBoundException, MalformedURLException {
        if (proxyHandler == null) proxyHandler = new ProxyHandler();
        return proxyHandler;
    }

    @Override
    public SuperService getService(ServiceTypes serviceTypes) throws Exception {
        return serviceFactory.getService(serviceTypes);
    }
}
