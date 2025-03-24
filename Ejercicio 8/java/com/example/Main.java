package com.example;

public class Main {
    public static void main(String[] args) {
        
    Conversión a horas y minutos:


        int minutosTotales = 3665;

 
        int horas = minutosTotales / 60;
        int minutos = minutosTotales % 60;


        System.out.printf("%d minutos equivalen a:%n", minutosTotales);
        System.out.printf("%d horas y %d minutos%n", horas, minutos);

        Conversión a días, horas y minutos:

        int minutosTotales = 3665;

     
        int dias = minutosTotales / 1440; // 1440 minutos en un día
        int horas = (minutosTotales % 1440) / 60;
        int minutos = minutosTotales % 60;

        System.out.printf("%d minutos equivalen a:%n", minutosTotales);
        System.out.printf("%d días, %d horas y %d minutos%n", dias, horas, minutos);



    }
}