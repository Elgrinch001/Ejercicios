package com.example;

public class Main {
    public static void main(String[] args) {
        
 Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        if (edad >= 0 && edad <= 2) {
            System.out.println("Bebé");
        } else if (edad >= 3 && edad <= 12) {
            System.out.println("Niño");
        } else if (edad >= 13 && edad <= 19) {
            System.out.println("Adolescente");
        } else if (edad >= 20 && edad <= 64) {
            System.out.println("Adulto");
        } else if (edad >= 65) {
            System.out.println("Adulto mayor");
        } else {
            System.out.println("Edad no válida.");
        }
    }

    }
