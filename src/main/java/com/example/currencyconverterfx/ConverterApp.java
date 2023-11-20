package com.example.currencyconverterfx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ConverterApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ConverterApp.class.getResource("converter.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("Currency Converter");
        stage.setScene(scene);
        stage.setResizable(false);

        stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/iconCurr.png"))));
        stage.setOnCloseRequest(windowEvent -> {
            Platform.exit();
            System.exit(0);
        });

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}