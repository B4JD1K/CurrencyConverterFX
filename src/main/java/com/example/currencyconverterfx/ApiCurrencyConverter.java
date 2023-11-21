package com.example.currencyconverterfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ApiCurrencyConverter implements CurrencyConverter{
    private String apiKey;
    private ArrayList<Currency> currencyList;
    private String currencyFrom, currencyTo;

    public ApiCurrencyConverter(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public double convert(double amount, Currency fromCurrency, Currency toCurrency) {
        return 0D;
    }

    @Override
    public ExchangeRate getExchangeRate(Currency fromCurrency, Currency toCurrency) {
        return null;
    }


    public void initialize() {
        getApiKey();    // working
//        System.out.println(apiKey);   // working

        currencyList = (ArrayList<Currency>) CurrencyService.loadCurrencyList();
        ObservableList<String> options = FXCollections.observableArrayList();

    }

    private void getApiKey() {
        BufferedReader reader = null;
        try {
            {
                String filePath = getClass()
                        .getResource("/apikey.txt")
                        .getPath()
                        .replaceAll("%20", " ");
                reader = new BufferedReader(new FileReader(filePath));

                apiKey=reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }

}
