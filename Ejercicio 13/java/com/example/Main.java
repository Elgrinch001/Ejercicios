package com.example;

public class Main {
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el monto del préstamo: ");
        double monto = sc.nextDouble();

        System.out.print("Ingresa la tasa de interés anual (en porcentaje): ");
        double tasaInteres = sc.nextDouble() / 100;

        System.out.print("Ingresa el número de años: ");
        int anos = sc.nextInt();

        
        double c = tasaInteres / 12; 
        int n = anos * 12; 

        double pagoMensual = monto * (c * Math.pow(1 + c, n)) / (Math.pow(1 + c, n) - 1);

        System.out.println("El pago mensual es: " + pagoMensual);
    }

    }
