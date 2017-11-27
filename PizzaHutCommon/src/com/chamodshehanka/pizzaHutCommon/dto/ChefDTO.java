package com.chamodshehanka.pizzaHutCommon.dto;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class ChefDTO extends SuperDTO{

    private String chefID;
    private String orderID;

    public ChefDTO() {
    }

    public ChefDTO(String chefID, String orderID) {
        this.chefID = chefID;
        this.orderID = orderID;
    }

    public String getChefID() {
        return chefID;
    }

    public void setChefID(String chefID) {
        this.chefID = chefID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
}
