package com.example;

public class Main {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        
                System.out.print("Ingresa el primer lado: ");
                int lado1 = sc.nextInt();
        
                System.out.print("Ingresa el segundo lado: ");
                int lado2 = sc.nextInt();
        
                System.out.print("Ingresa el tercer lado: ");
                int lado3 = sc.nextInt();
        
                if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
                    if (lado1 == lado2 && lado2 == lado3) {
                        System.out.println("Es un triángulo equilátero.");
                    } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                        System.out.println("Es un triángulo isósceles.");
                    } else {
                        System.out.println("Es un triángulo escaleno.");
                    }
                } else {
                    System.out.println("No puede formar un triángulo.");
                }
            }
        }
    