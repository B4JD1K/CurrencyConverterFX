package com.example.currencyconverterfx;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CurrencyService {
    private static final String apiKey = String.valueOf(new File("src/main/resources/apikey.txt"));

    public static List<Currency> loadCurrencyList() {
        List<Currency> currencyList = new ArrayList<>();
        try {
            OkHttpClient client = new OkHttpClient.Builder().build();

            Request request = new Request.Builder()
                    .url("https://api.apilayer.com/currency_data/list")
                    .addHeader("apikey", apiKey)
                    .method("GET", null)
                    .build();

            Response response = client.newCall(request).execute();
            Gson gson = new Gson();
            JsonElement jsonElement = gson.fromJson(response.body().charStream(), JsonElement.class);
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            for (String currencyCode : jsonObject.getAsJsonObject("currencies").keySet()) {
                currencyList.add(Currency.valueOf(currencyCode));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return currencyList;
    }
}
