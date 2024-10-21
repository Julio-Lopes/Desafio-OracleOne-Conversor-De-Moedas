package com.ConversorDeMoedas.Services;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Moeda {
    public double converte(String local, String converter, double valor) {
        double resultado = 0;

        try {
            String url_str = "https://v6.exchangerate-api.com/v6/" + "api_key" + "/latest/" + local;

            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            
            InputStream inputStream = (InputStream) request.getContent(); 
            InputStreamReader reader = new InputStreamReader(inputStream); 

            Gson gson = new Gson();
            JsonObject jsonobj = gson.fromJson(reader, JsonObject.class);

            JsonObject conversionRates = jsonobj.getAsJsonObject("conversion_rates");

            double valorConversao = conversionRates.get(converter).getAsDouble();
            
            resultado = valor * valorConversao;

            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("erro");
        }
        return resultado;
    }
}