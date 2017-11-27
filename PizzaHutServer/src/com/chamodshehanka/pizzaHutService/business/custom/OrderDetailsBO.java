package com.chamodshehanka.pizzaHutService.business.custom;

import com.chamodshehanka.pizzaHutCommon.dto.OrderDetailDTO;
import com.chamodshehanka.pizzaHutService.business.SuperBO;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public interface OrderDetailsBO extends SuperBO{

    public boolean addOrderDetails(OrderDetailDTO orderDetailDTO)throws Exception;

    public boolean searchOrderDetails(String id)throws Exception;

    public ArrayList<OrderDetailDTO> getAllOrderDetails()throws Exception;

}
