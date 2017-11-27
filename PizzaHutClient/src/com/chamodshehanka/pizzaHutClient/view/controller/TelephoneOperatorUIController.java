package com.chamodshehanka.pizzaHutClient.view.controller;

import com.chamodshehanka.pizzaHutClient.proxy.ProxyHandler;
import com.chamodshehanka.pizzaHutCommon.dto.CustomerDTO;
import com.chamodshehanka.pizzaHutCommon.service.ServiceFactory;
import com.chamodshehanka.pizzaHutCommon.service.custom.CustomerService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class TelephoneOperatorUIController implements Initializable{

    @FXML
    private TextField txtCustomerId;

    @FXML
    private TextField txtCustomerName;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtContact;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void addCustomer(ActionEvent actionEvent){
        CustomerDTO customerDTO = new CustomerDTO(
                txtCustomerId.getText(),
                txtCustomerName.getText(),
                txtAddress.getText(),
                Integer.valueOf(txtContact.getText())
        );

        try {
            CustomerService customerService = (CustomerService) ProxyHandler.getInstance()
                    .getService(ServiceFactory.ServiceTypes.CUSTOMER);
            boolean isAdded = customerService.addCustomer(customerDTO);
            if (isAdded){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Customer");
                alert.setHeaderText("Look, a information Dialog");
                alert.setContentText("Customer has been successfully added");
                alert.showAndWait();
            }else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Customer");
                alert.setHeaderText("Look, a information Dialog");
                alert.setContentText("Customer couldn't added");
                alert.showAndWait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void getCustomerByID(ActionEvent actionEvent){
        try {
            CustomerService customerService = (CustomerService) ProxyHandler.getInstance()
                    .getService(ServiceFactory.ServiceTypes.CUSTOMER);
            CustomerDTO customerDTO = customerService.getById(txtCustomerId.getText());

            if (customerDTO != null){
                txtCustomerName.setText(customerDTO.getCustomerName());
                txtAddress.setText(customerDTO.getAddress());
                txtContact.setText(String.valueOf(customerDTO.getContactNo()));
            }else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Customer");
                alert.setHeaderText("Look, a information Dialog");
                alert.setContentText("Customer couldn't found");
                alert.showAndWait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
