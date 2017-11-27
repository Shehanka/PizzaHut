package com.chamodshehanka.pizzaHutService.entity;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class Orders {

    private String orderId;
    private String orderDate;
    private String customerId;

    private ArrayList<OrderDetails> detailDTOArrayList;

    public Orders() {
    }

    public Orders(String orderId, String orderDate, String customerId, ArrayList<OrderDetails> detailDTOArrayList) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.customerId = customerId;
        this.detailDTOArrayList = detailDTOArrayList;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId='" + orderId + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", customerId='" + customerId + '\'' +
                ", detailDTOArrayList=" + detailDTOArrayList +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ArrayList<OrderDetails> getDetailDTOArrayList() {
        return detailDTOArrayList;
    }

    public void setDetailDTOArrayList(ArrayList<OrderDetails> detailDTOArrayList) {
        this.detailDTOArrayList = detailDTOArrayList;
    }
}
