package com.chamodshehanka.pizzaHutService.business;

import com.chamodshehanka.pizzaHutService.business.custom.impl.*;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory(){}

    public static BOFactory getInstance(){
        if (boFactory == null)boFactory = new BOFactory();
        return boFactory;
    }

    public SuperBO getBO(BOTypes boTypes){
        switch (boTypes){
            case CUSTOMER:return new CustomerBOImpl();
            case ITEM: return new ItemBOImpl();
            case CHEF: return new ChefBOImpl();
            case ORDER: return new OrderBOImpl();
            case ORDER_DETAILS: return new OrderDetailsBOImpl();
            default: return null;
        }
    }

    public enum BOTypes{
        CUSTOMER,ITEM,CHEF,ORDER,ORDER_DETAILS
    }
}
