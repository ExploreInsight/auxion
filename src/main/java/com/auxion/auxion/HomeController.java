package com.auxion.auxion;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class HomeController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button btn;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText(btn.getText());
        btn.setText("Welcome to JavaFX Application!");

    }
}