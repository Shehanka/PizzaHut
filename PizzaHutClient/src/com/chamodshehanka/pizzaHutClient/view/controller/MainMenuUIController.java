package com.chamodshehanka.pizzaHutClient.view.controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class MainMenuUIController implements Initializable{

    @FXML
    private AnchorPane rootMainMenu;

    @FXML
    private JFXComboBox<String> cmbUIType;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadComboBoxValues();
    }

    @FXML
    private void loadUIType(ActionEvent actionEvent){
        String uiType = cmbUIType.getSelectionModel().getSelectedItem();
        if (Objects.equals(uiType, "Chef")){
            viewChef(new ActionEvent());
        }else if (Objects.equals(uiType, "TelephoneOperator")){
            viewTelOperator(new ActionEvent());
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Message");
            alert.setContentText("There're no UI selected");
            alert.showAndWait();
        }
    }

    @FXML
    private void viewChef(ActionEvent event) {
        try {
            AnchorPane chefPane = FXMLLoader.load(getClass().getResource(
                    "/com/chamodshehanka/pizzaHutClient/view/fxml/ChefUI.fxml"
            ));
            rootMainMenu.getChildren().setAll(chefPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void viewTelOperator(ActionEvent event) {
        try {
            AnchorPane telOperatorPane = FXMLLoader.load(getClass().getResource(
                    "/com/chamodshehanka/pizzaHutClient/view/fxml/TelephoneOperatorUI.fxml"
            ));
            rootMainMenu.getChildren().setAll(telOperatorPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadComboBoxValues(){
        cmbUIType.getItems().addAll("TelephoneOperator","Chef");
    }
}
