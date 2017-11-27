package com.chamodshehanka.pizzaHutService.repository.custom.impl;

import com.chamodshehanka.pizzaHutService.entity.Item;
import com.chamodshehanka.pizzaHutService.repository.custom.ItemRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class ItemRepositoryImpl implements ItemRepository{

    private Connection connection;

    @Override
    public void setConnection(Connection connection) throws Exception {
        this.connection = connection;
    }

    @Override
    public boolean save(Item item) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Item item) throws Exception {
        return false;
    }

    @Override
    public boolean update(Item item) throws Exception {
        return false;
    }

    @Override
    public Item getById(String s) throws Exception {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM item WHERE code='"+s+"'");
        return resultSet.next() ? new Item(
                resultSet.getString(1),
                resultSet.getString(2),
                resultSet.getDouble(3)
        ) : null;
    }

    @Override
    public List<Item> getAll() throws Exception {
        return null;
    }
}
