package com.chamodshehanka.pizzaHutService.repository;

import java.sql.Connection;
import java.util.List;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public interface SuperRepository <T,ID>{

    public void setConnection(Connection connection)throws Exception;

    public boolean save(T t)throws Exception;

    public boolean delete(T t)throws Exception;

    public boolean update(T t)throws Exception;

    public T getById(ID id)throws Exception;

    public List<T> getAll()throws Exception;

}
