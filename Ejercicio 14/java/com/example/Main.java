package com.example;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
                System.out.print("Ingresa un año: ");
                int anio = sc.nextInt();
        
                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                    System.out.println(anio + " es un año bisiesto.");
                } else {
                    System.out.println(anio + " no es un año bisiesto.");
                }
            }
    }
