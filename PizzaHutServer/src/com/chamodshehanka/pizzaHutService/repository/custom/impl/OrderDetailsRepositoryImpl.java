package com.chamodshehanka.pizzaHutService.repository.custom.impl;

import com.chamodshehanka.pizzaHutService.entity.OrderDetails;
import com.chamodshehanka.pizzaHutService.repository.custom.OrderDetailsRepository;

import java.sql.Connection;
import java.util.List;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class OrderDetailsRepositoryImpl implements OrderDetailsRepository{

    private Connection connection;

    @Override
    public void setConnection(Connection connection) throws Exception {
        this.connection = connection;
    }

    @Override
    public boolean save(OrderDetails orderDetails) throws Exception {
        return false;
    }

    @Override
    public boolean delete(OrderDetails orderDetails) throws Exception {
        return false;
    }

    @Override
    public boolean update(OrderDetails orderDetails) throws Exception {
        return false;
    }

    @Override
    public OrderDetails getById(String s) throws Exception {
        return null;
    }

    @Override
    public List<OrderDetails> getAll() throws Exception {
        return null;
    }
}
