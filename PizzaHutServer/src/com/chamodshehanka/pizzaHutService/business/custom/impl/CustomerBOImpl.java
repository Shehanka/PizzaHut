package com.chamodshehanka.pizzaHutService.business.custom.impl;

import com.chamodshehanka.pizzaHutCommon.dto.CustomerDTO;
import com.chamodshehanka.pizzaHutService.business.custom.CustomerBO;
import com.chamodshehanka.pizzaHutService.entity.Customer;
import com.chamodshehanka.pizzaHutService.repository.RepositoryFactory;
import com.chamodshehanka.pizzaHutService.repository.custom.CustomerRepository;
import com.chamodshehanka.pizzaHutService.resources.DBConnection;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class CustomerBOImpl implements CustomerBO{

    private CustomerRepository customerRepository;

    public CustomerBOImpl(){
        customerRepository = (CustomerRepository) RepositoryFactory.getInstance()
                .getRepository(RepositoryFactory.RepositoryTypes.CUSTOMER);
    }

    @Override
    public boolean save(CustomerDTO customerDTO) throws Exception {
        Connection connection = DBConnection.getConnection();
        customerRepository.setConnection(connection);
        return customerRepository.save(new Customer(
                customerDTO.getCustomerId(),
                customerDTO.getCustomerName(),
                customerDTO.getAddress(),
                customerDTO.getContactNo()
        ));
    }

    @Override
    public boolean update(CustomerDTO customerDTO) throws Exception {
        Connection connection = DBConnection.getConnection();
        customerRepository.setConnection(connection);
        return customerRepository.update(new Customer(
                customerDTO.getCustomerId(),
                customerDTO.getCustomerName(),
                customerDTO.getAddress(),
                customerDTO.getContactNo()
        ));
    }

    @Override
    public boolean delete(CustomerDTO customerDTO) throws Exception {
        Connection connection = DBConnection.getConnection();
        customerRepository.setConnection(connection);
        return customerRepository.delete(new Customer(
                customerDTO.getCustomerId(),
                customerDTO.getCustomerName(),
                customerDTO.getAddress(),
                customerDTO.getContactNo()
        ));
    }

    @Override
    public CustomerDTO getById(String customerID) throws Exception {
        Connection connection = DBConnection.getConnection();
        customerRepository.setConnection(connection);
        Customer customer = customerRepository.getById(customerID);
        return new CustomerDTO(
                customer.getCustomerId(),
                customer.getCustomerName(),
                customer.getAddress(),
                customer.getContactNo()
        );
    }

    @Override
    public List<CustomerDTO> getAll() throws Exception {
        Connection connection = DBConnection.getConnection();
        customerRepository.setConnection(connection);
        List<Customer> customerList = customerRepository.getAll();
        ArrayList<CustomerDTO> arrayList = new ArrayList<>();
        for (Customer customer:
             customerList) {
            CustomerDTO customerDTO = new CustomerDTO(
                    customer.getCustomerId(),
                    customer.getCustomerName(),
                    customer.getAddress(),
                    customer.getContactNo()
            );
            arrayList.add(customerDTO);
        }
        return arrayList;
    }
}
