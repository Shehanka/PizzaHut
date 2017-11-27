package com.chamodshehanka.pizzaHutClient.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class StartProject extends Application{

    public static boolean isSplashLoaded = false;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource(
                "/com/chamodshehanka/pizzaHutClient/view/fxml/SplashScreen.fxml"
        ));
        primaryStage.setScene(new Scene(parent));
        primaryStage.setTitle("Pizza Hut");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
