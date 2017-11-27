package com.chamodshehanka.pizzaHutService.entity;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class Chef {

    private String chefID;
    private String orderID;

    public Chef() {
    }

    public Chef(String chefID, String orderID) {
        this.chefID = chefID;
        this.orderID = orderID;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "chefID='" + chefID + '\'' +
                ", orderID='" + orderID + '\'' +
                '}';
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
