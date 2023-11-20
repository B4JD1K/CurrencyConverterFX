package com.example.currencyconverterfx;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;

public class ConverterController {
    @FXML
    public TextField enterAmount;
    @FXML
    public ComboBox<String> currencyFromBox, currencyToBox;
    @FXML
    public Label convertedAmount;

    private String currencyFrom, currencyTo;


}