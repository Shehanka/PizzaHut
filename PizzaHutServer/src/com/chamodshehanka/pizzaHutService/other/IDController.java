package com.chamodshehanka.pizzaHutService.other;

import com.chamodshehanka.pizzaHutService.resources.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class IDController {
    public static String getLastID(String tblName, String colName)throws SQLException,ClassNotFoundException{
        String SQL = String.format("SELECT %s FROM %s ORDER BY %s DESC LIMIT 1",colName,tblName,colName);
        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL);
        return resultSet.next() ? resultSet.getString(1) : null;
    }
}
