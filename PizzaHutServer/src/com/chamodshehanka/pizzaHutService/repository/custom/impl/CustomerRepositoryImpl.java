package com.chamodshehanka.pizzaHutService.repository.custom.impl;

import com.chamodshehanka.pizzaHutService.entity.Customer;
import com.chamodshehanka.pizzaHutService.repository.custom.CustomerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class CustomerRepositoryImpl implements CustomerRepository{

    private Connection connection;

    @Override
    public void setConnection(Connection connection) throws Exception {
        this.connection = connection;
    }

    @Override
    public boolean save(Customer customer) throws Exception {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO Customer VALUES (?,?,?,?)"
        );
        preparedStatement.setObject(1,customer.getCustomerId());
        preparedStatement.setObject(2,customer.getCustomerName());
        preparedStatement.setObject(3,customer.getAddress());
        preparedStatement.setObject(4,customer.getContactNo());

        return preparedStatement.executeUpdate()>0;
    }

    @Override
    public boolean delete(Customer customer) throws Exception {
        Statement statement = connection.createStatement();
        return statement.executeUpdate("DELETE FROM customer WHERE customerId='"+customer.getCustomerId()+"'")>0;
    }

    @Override
    public boolean update(Customer customer) throws Exception {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "UPDATE customer SET cid=?,name=?,address=?,contactNo=?"
        );
        preparedStatement.setObject(1,customer.getCustomerId());
        preparedStatement.setObject(2,customer.getCustomerName());
        preparedStatement.setObject(3,customer.getAddress());
        preparedStatement.setObject(4,customer.getContactNo());

        return preparedStatement.executeUpdate()>0;
    }

    @Override
    public Customer getById(String s) throws Exception {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM customer WHERE cid='"+s+"'");
        return (resultSet.next()) ? new Customer(
                resultSet.getString(1),
                resultSet.getString(2),
                resultSet.getString(3),
                resultSet.getInt(4)
        ) : null;
    }

    @Override
    public List<Customer> getAll() throws Exception {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM customer");
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        while (resultSet.next()){
            Customer customer = new Customer(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getInt(4)
            );
            customerArrayList.add(customer);
        }
        return customerArrayList;
    }
}
