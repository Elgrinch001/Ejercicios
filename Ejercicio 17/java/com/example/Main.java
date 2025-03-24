package com.example;

public class Main {
    public static void main(String[] args) {
        int num1 = 3, num2 = 4, num3 = 5;

        int suma = num1 + num2 + num3;
        int multiplicacion = num1 * num2 * num3;
        double promedio = (num1 + num2 + num3) / 3.0;

        System.out.println("Suma: " + suma);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("Promedio: " + promedio);

        if (promedio > suma) {
            System.out.println("El promedio es mayor que la suma.");
        } else {
            System.out.println("La suma es mayor o igual al promedio.");
        }
    }
}
 