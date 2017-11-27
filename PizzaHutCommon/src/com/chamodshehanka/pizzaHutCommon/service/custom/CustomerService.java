package com.chamodshehanka.pizzaHutCommon.service.custom;

import com.chamodshehanka.pizzaHutCommon.dto.CustomerDTO;
import com.chamodshehanka.pizzaHutCommon.service.SuperService;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public interface CustomerService extends SuperService{
    public boolean addCustomer(CustomerDTO customerDTO)throws Exception;

    public CustomerDTO getById(String id)throws Exception;
}
