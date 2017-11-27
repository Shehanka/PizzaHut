package com.chamodshehanka.pizzaHutCommon.dto;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class CustomerDTO extends SuperDTO{

    private String customerId;
    private String customerName;
    private String address;
    private int contactNo;

    public CustomerDTO() {
    }

    public CustomerDTO(String customerId, String customerName, String address, int contactNo) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.contactNo = contactNo;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }
}
