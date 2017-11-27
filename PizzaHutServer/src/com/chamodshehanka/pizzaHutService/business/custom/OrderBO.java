package com.chamodshehanka.pizzaHutService.business.custom;

import com.chamodshehanka.pizzaHutCommon.dto.OrdersDTO;
import com.chamodshehanka.pizzaHutService.business.SuperBO;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public interface OrderBO extends SuperBO{

    public boolean addOrder(OrdersDTO ordersDTO)throws Exception;

    public OrdersDTO searchOrder(String id)throws Exception;

    public ArrayList<OrdersDTO> getAllOrders()throws Exception;

}
