package com.chamodshehanka.pizzaHutService.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class DBConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost/pizzahut","root","wampwamp");
    }
}
