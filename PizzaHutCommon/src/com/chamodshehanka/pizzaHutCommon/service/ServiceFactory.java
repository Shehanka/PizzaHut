package com.chamodshehanka.pizzaHutCommon.service;

import java.rmi.Remote;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public interface ServiceFactory extends Remote{

    public enum ServiceTypes{
        CUSTOMER,ITEM
    }

    public SuperService getService(ServiceTypes serviceTypes)throws Exception;

}
