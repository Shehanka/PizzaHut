package com.chamodshehanka.pizzaHutService.business.custom;

import com.chamodshehanka.pizzaHutCommon.dto.CustomerDTO;
import com.chamodshehanka.pizzaHutService.business.SuperBO;

import java.util.List;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public interface CustomerBO extends SuperBO{

    public boolean save(CustomerDTO customerDTO)throws Exception;

    public boolean update(CustomerDTO customerDTO)throws Exception;

    public boolean delete(CustomerDTO customerDTO)throws Exception;

    public CustomerDTO getById(String customerID)throws Exception;

    public List<CustomerDTO> getAll()throws Exception;

}
