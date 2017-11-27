package com.chamodshehanka.pizzaHutService.entity;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class Item {
    private String code;
    private String description;
    private double unitPrice;

    public Item() {
    }

    public Item(String code, String description, double unitPrice) {
        this.code = code;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
