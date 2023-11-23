package com.auxion.auxion;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

//import javax.swing.*;

public class HelloController<XMLLoader> {
    @FXML
    private Label welcomeText;
    @FXML
    private Button btn;
    @FXML
    private Button btn1;


    @FXML
    protected void onAdminClick() throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
        primaryStage.setTitle("Admin Window");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    @FXML
    protected void onUserClick() throws IOException {
        Stage primaryStage1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("UserLogin.fxml"));
        primaryStage1.setTitle("Admin Window");
        primaryStage1.setScene(new Scene(root));
        primaryStage1.show();



    }
}