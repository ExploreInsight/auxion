package com.auxion.auxion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 400);

        primaryStage.setScene(scene);

        // primaryStage.setOnShown(event -> primaryStage.requestFocus());

        primaryStage.setTitle("Auxion");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}