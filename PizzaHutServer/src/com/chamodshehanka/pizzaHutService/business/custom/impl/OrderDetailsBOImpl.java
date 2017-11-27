package com.chamodshehanka.pizzaHutService.business.custom.impl;

import com.chamodshehanka.pizzaHutCommon.dto.OrderDetailDTO;
import com.chamodshehanka.pizzaHutService.business.custom.OrderDetailsBO;
import com.chamodshehanka.pizzaHutService.repository.RepositoryFactory;
import com.chamodshehanka.pizzaHutService.repository.custom.OrderDetailsRepository;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class OrderDetailsBOImpl implements OrderDetailsBO{

    private OrderDetailsRepository orderDetailsRepository;

    public OrderDetailsBOImpl(){
        orderDetailsRepository = (OrderDetailsRepository) RepositoryFactory
                .getInstance().getRepository(RepositoryFactory.RepositoryTypes.ORDER_DETAILS);
    }

    @Override
    public boolean addOrderDetails(OrderDetailDTO orderDetailDTO) throws Exception {
        return false;
    }

    @Override
    public boolean searchOrderDetails(String id) throws Exception {
        return false;
    }

    @Override
    public ArrayList<OrderDetailDTO> getAllOrderDetails() throws Exception {
        return null;
    }
}
