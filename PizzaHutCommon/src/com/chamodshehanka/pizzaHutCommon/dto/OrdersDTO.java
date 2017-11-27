package com.chamodshehanka.pizzaHutCommon.dto;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class OrdersDTO extends SuperDTO{

    private String orderId;
    private String orderDate;
    private String customerId;

    private ArrayList<OrderDetailDTO> detailDTOArrayList;

    public OrdersDTO() {
    }

    public OrdersDTO(String orderId, String orderDate, String customerId, ArrayList<OrderDetailDTO> detailDTOArrayList) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.customerId = customerId;
        this.detailDTOArrayList = detailDTOArrayList;
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

    public ArrayList<OrderDetailDTO> getDetailDTOArrayList() {
        return detailDTOArrayList;
    }

    public void setDetailDTOArrayList(ArrayList<OrderDetailDTO> detailDTOArrayList) {
        this.detailDTOArrayList = detailDTOArrayList;
    }
}
