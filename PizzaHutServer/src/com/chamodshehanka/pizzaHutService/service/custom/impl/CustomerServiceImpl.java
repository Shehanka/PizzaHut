package com.chamodshehanka.pizzaHutService.service.custom.impl;

import com.chamodshehanka.pizzaHutCommon.dto.CustomerDTO;
import com.chamodshehanka.pizzaHutCommon.service.custom.CustomerService;
import com.chamodshehanka.pizzaHutService.business.BOFactory;
import com.chamodshehanka.pizzaHutService.business.custom.CustomerBO;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class CustomerServiceImpl extends UnicastRemoteObject implements CustomerService{

    private CustomerBO customerBO;

    public CustomerServiceImpl() throws RemoteException {
        customerBO = (CustomerBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CUSTOMER);
    }

    @Override
    public boolean addCustomer(CustomerDTO customerDTO) throws Exception {
        return customerBO.save(customerDTO);
    }

    @Override
    public CustomerDTO getById(String id) throws Exception {
        return customerBO.getById(id);
    }
}
