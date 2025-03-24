package com.example;

public class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
                System.out.print("Ingresa un número: ");
                int numero = sc.nextInt();
        
                if (numero % 2 == 0) {
                    System.out.println("El número es múltiplo de 2.");
                }
                if (numero % 3 == 0) {
                    System.out.println("El número es múltiplo de 3.");
                }
                if (numero % 5 == 0) {
                    System.out.println("El número es múltiplo de 5.");
                }
            }
    }
