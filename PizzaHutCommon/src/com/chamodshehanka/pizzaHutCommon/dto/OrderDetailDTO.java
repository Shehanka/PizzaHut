package com.chamodshehanka.pizzaHutCommon.dto;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class OrderDetailDTO extends SuperDTO{

    private String orderId;
    private String code;
    private int qty;
    private double unitPrice;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(String orderId, String code, int qty, double unitPrice) {
        this.orderId = orderId;
        this.code = code;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
