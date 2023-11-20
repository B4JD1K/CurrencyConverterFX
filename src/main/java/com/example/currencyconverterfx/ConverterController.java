package com.example.currencyconverterfx;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class ConverterController {
    @FXML
    public TextField enterAmount;
    @FXML
    public ComboBox<String> currencyFromBox, currencyToBox;
    @FXML
    public Label convertedAmount;

    private String currencyFrom, currencyTo, apiKey;

    private ArrayList<String> currencyList;




}