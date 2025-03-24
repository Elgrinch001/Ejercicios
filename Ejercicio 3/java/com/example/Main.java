package com.example;

public class Main {
    public static void main(String[] args) {

        int a = -10;

        if (a <= 0) {
            System.out.println("Es solido");
        } else if (a > 0 && a < 100) {
            System.out.println("Es liquido");
        } else {
            System.out.println("Es gaseoso");
        }

    }
}