package com.example;

public class Main {
    public static void main(String[] args) {
        
 Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa los años como cliente: ");
        int años = sc.nextInt();

        System.out.print("Ingresa el monto de la compra: ");
        double compra = sc.nextDouble();

        double descuentoPorLealtad;

        if (años >= 1 && años <= 2) {
            descuentoPorLealtad = 0.05;
        } else if (años >= 3 && años <= 5) {
            descuentoPorLealtad = 0.10;
        } else if (años > 5) {
            descuentoPorLealtad = 0.15;
        } else {
            descuentoPorLealtad = 0;
        }

        double descuentoTotal = compra * descuentoPorLealtad;

        if (compra > 500) {
            descuentoTotal += compra * 0.05; 
        }

        double precioFinal = compra - descuentoTotal;

        System.out.println("El descuento aplicado es: " + descuentoTotal);
        System.out.println("El precio final es: " + precioFinal);
    }
}

    