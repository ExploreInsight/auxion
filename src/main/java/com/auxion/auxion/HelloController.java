package com.auxion.auxion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

//import javax.swing.*;

public class HelloController<XMLLoader> {
//=======

    @FXML
    private Button btn;
    @FXML
    private Button btn1;


    @FXML
    protected void onAdminClick() throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AdminLogin.fxml")));
        primaryStage.setTitle("Admin Window");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    @FXML
    protected void onUserClick() throws IOException {
        Stage primaryStage1 = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("UserLogin.fxml")));
        primaryStage1.setTitle("Admin Window");
        primaryStage1.setScene(new Scene(root));
        primaryStage1.show();

    }
    @FXML
    protected void onClickSignUp() throws IOException {
        Stage primaryStage2 = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("registration.fxml")));
        primaryStage2.setTitle("Registration Form");
        primaryStage2.setScene(new Scene(root));
        primaryStage2.show();

    }

}
