package com.example.currencyconverterfx;

public interface CurrencyConverter {
    double convert(double amount, Currency fromCurrency, Currency toCurrency);

    ExchangeRate getExchangeRate(Currency fromCurrency, Currency toCurrency);
}
