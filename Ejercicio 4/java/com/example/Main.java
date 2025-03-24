package com.example;

public class Main {
    public static void main(String[] args) {

       int a = 200;

        if (a > 100) {
        System.out.println("Tendras un descuento del 10% y te quedaria en " + (a *
        0.10));
        } else if (a > 50 && a <= 100) {
        System.out.println("Tendras un descuento del 5% " + (a * 0.05));
        } else {
        System.out.println("No tendras descuento");
        }





    }
}