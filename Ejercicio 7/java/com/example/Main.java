package com.example;

public class Main {
    public static void main(String[] args) {
        
            // Datos de entrada
        double peso = 78.5; // en kilogramos
        double altura = 1.80; // en metros

        // Cálculo del IMC
        double imc = peso / (altura * altura);

        // Mostrar IMC
        System.out.printf("Su IMC es: %.1f%n", imc);

        // Clasificar estado de salud
        if (imc < 18.5) {
        System.out.println("Bajo peso");
        } else if (imc < 25) {
        System.out.println("Peso normal");
        } else if (imc < 30) {
        System.out.println("Sobrepeso");
        } else {
        System.out.println("Obesidad");
        }

    }
}