package com.example;

public class Main {
    public static void main(String[] args) {
       
  // Convertir de Celsius a Fahrenheit
        String celsiusStr = "28";
        double celsius = Double.parseDouble(celsiusStr);
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");

        // Convertir de Fahrenheit a Celsius
        double tempF = 25.3;
        double tempC = (tempF - 32) * 5/9;
        int tempCInt = (int) tempC; 

        System.out.println(tempF + "°F equivale a " + tempC + "°C");
        System.out.println("Temperatura en Celsius (redondeada): " + tempCInt +
        "°C");



    }
}