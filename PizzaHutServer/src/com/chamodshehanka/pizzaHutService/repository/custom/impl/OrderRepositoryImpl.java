package com.chamodshehanka.pizzaHutService.repository.custom.impl;

import com.chamodshehanka.pizzaHutService.entity.Orders;
import com.chamodshehanka.pizzaHutService.repository.custom.OrderRepository;

import java.sql.Connection;
import java.util.List;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class OrderRepositoryImpl implements OrderRepository{

    private Connection connection;

    @Override
    public void setConnection(Connection connection) throws Exception {
        this.connection = connection;
    }

    @Override
    public boolean save(Orders orders) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Orders orders) throws Exception {
        return false;
    }

    @Override
    public boolean update(Orders orders) throws Exception {
        return false;
    }

    @Override
    public Orders getById(String s) throws Exception {
        return null;
    }

    @Override
    public List<Orders> getAll() throws Exception {
        return null;
    }
}
