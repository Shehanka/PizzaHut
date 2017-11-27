package com.chamodshehanka.pizzaHutService.repository.custom.impl;

import com.chamodshehanka.pizzaHutService.entity.Chef;
import com.chamodshehanka.pizzaHutService.repository.custom.ChefRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class ChefRepositoryImpl implements ChefRepository{

    private Connection connection;

    @Override
    public void setConnection(Connection connection) throws Exception {
        this.connection = connection;
    }

    @Override
    public boolean save(Chef chef) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Chef chef) throws Exception {
        return false;
    }

    @Override
    public boolean update(Chef chef) throws Exception {
        return false;
    }

    @Override
    public Chef getById(String s) throws Exception {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM chef WHERE chefID='"+s+"'");
        return resultSet.next() ? new Chef(
                resultSet.getString(1),
                resultSet.getString(2)
        ) : null;
    }

    @Override
    public List<Chef> getAll() throws Exception {
        return null;
    }
}
