package com.chamodshehanka.pizzaHutService.repository;

import com.chamodshehanka.pizzaHutService.repository.custom.impl.*;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class RepositoryFactory {

    private static RepositoryFactory repositoryFactory;

    private RepositoryFactory(){}

    public static RepositoryFactory getInstance(){
        if (repositoryFactory == null)repositoryFactory = new RepositoryFactory();
        return repositoryFactory;
    }

    public SuperRepository getRepository(RepositoryTypes repositoryTypes){
        switch (repositoryTypes){
            case CUSTOMER: return new CustomerRepositoryImpl();
            case ITEM: return new ItemRepositoryImpl();
            case CHEF: return new ChefRepositoryImpl();
            case ORDERS: return new OrderRepositoryImpl();
            case ORDER_DETAILS: return new OrderDetailsRepositoryImpl();
            default: return null;
        }
    }

    public enum RepositoryTypes{
        CUSTOMER,ITEM,CHEF,ORDERS,ORDER_DETAILS
    }
}
