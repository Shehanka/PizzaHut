package com.chamodshehanka.pizzaHutService.business.custom.impl;

import com.chamodshehanka.pizzaHutCommon.dto.OrderDetailDTO;
import com.chamodshehanka.pizzaHutCommon.dto.OrdersDTO;
import com.chamodshehanka.pizzaHutService.business.custom.OrderBO;
import com.chamodshehanka.pizzaHutService.entity.OrderDetails;
import com.chamodshehanka.pizzaHutService.entity.Orders;
import com.chamodshehanka.pizzaHutService.repository.RepositoryFactory;
import com.chamodshehanka.pizzaHutService.repository.custom.OrderRepository;
import com.chamodshehanka.pizzaHutService.resources.DBConnection;

import java.sql.Connection;
import java.util.ArrayList;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class OrderBOImpl implements OrderBO{

    private OrderRepository orderRepository;

    public OrderBOImpl(){
        orderRepository = (OrderRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.ORDERS);
    }

    @Override
    public boolean addOrder(OrdersDTO ordersDTO) throws Exception {
        Connection connection = DBConnection.getConnection();
        orderRepository.setConnection(connection);
        ArrayList<OrderDetails> orderDetailsArrayList = new ArrayList<>();
        ArrayList<OrderDetailDTO> orderDetailDTOS= ordersDTO.getDetailDTOArrayList();

        for (OrderDetailDTO orderDetailDTO:
             orderDetailDTOS) {
            OrderDetails orderDetails = new OrderDetails();
            orderDetails.setCode(orderDetailDTO.getCode());
            orderDetails.setOrderId(orderDetailDTO.getOrderId());
            orderDetails.setQty(orderDetailDTO.getQty());
            orderDetails.setUnitPrice(orderDetailDTO.getUnitPrice());

            orderDetailsArrayList.add(orderDetails);
        }

        Orders orders = new Orders(
                ordersDTO.getOrderId(),
                ordersDTO.getOrderDate(),
                ordersDTO.getCustomerId(),
                orderDetailsArrayList
        );

        return orderRepository.save(orders);

    }

    @Override
    public OrdersDTO searchOrder(String id) throws Exception {
        Connection connection = DBConnection.getConnection();
        orderRepository.setConnection(connection);
        Orders orders = orderRepository.getById(id);

        ArrayList<OrderDetails> orderDetailsArrayList = orders.getDetailDTOArrayList();
        ArrayList<OrderDetailDTO> orderDetailDTOArrayList = new ArrayList<>();

        for (OrderDetails orderDetails:
             orderDetailsArrayList) {
            OrderDetailDTO orderDetailDTO = new OrderDetailDTO();

            orderDetailDTO.setCode(orderDetails.getCode());
            orderDetailDTO.setOrderId(orderDetails.getOrderId());
            orderDetailDTO.setQty(orderDetails.getQty());
            orderDetailDTO.setUnitPrice(orderDetails.getUnitPrice());

            orderDetailDTOArrayList.add(orderDetailDTO);
        }

        return new OrdersDTO(
                orders.getOrderId(),
                orders.getOrderDate(),
                orders.getCustomerId(),
                orderDetailDTOArrayList
        );
    }

    @Override
    public ArrayList<OrdersDTO> getAllOrders() throws Exception {
        Connection connection = DBConnection.getConnection();
        orderRepository.setConnection(connection);
        return null;
    }
}
