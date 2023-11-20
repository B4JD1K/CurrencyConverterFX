package com.example.currencyconverterfx;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ConverterController {
    @FXML
    public TextField enterAmount;
    @FXML
    public ComboBox fromCurrency, toCurrency;
    @FXML
    public Label convertedAmount;

}