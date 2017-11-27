package com.chamodshehanka.pizzaHutService.service;

import com.chamodshehanka.pizzaHutCommon.service.ServiceFactory;
import com.chamodshehanka.pizzaHutCommon.service.SuperService;
import com.chamodshehanka.pizzaHutService.service.custom.impl.CustomerServiceImpl;
import com.chamodshehanka.pizzaHutService.service.custom.impl.ItemServiceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class ServiceFactoryImpl extends UnicastRemoteObject implements ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactoryImpl() throws RemoteException {
    }

    public static ServiceFactory getInstance() throws RemoteException {
        if (serviceFactory == null)serviceFactory = new ServiceFactoryImpl();
        return serviceFactory;
    }



    @Override
    public SuperService getService(ServiceTypes serviceTypes) throws Exception {
        switch (serviceTypes){
            case CUSTOMER: return new CustomerServiceImpl();
            case ITEM: return new ItemServiceImpl();
            default: return null;
        }
    }
}
