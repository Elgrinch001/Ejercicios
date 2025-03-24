package com.example;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
                System.out.print("Ingresa la nota de los exámenes: ");
                double examenes = sc.nextDouble();
        
                System.out.print("Ingresa la nota de los proyectos: ");
                double proyectos = sc.nextDouble();
        
                System.out.print("Ingresa la nota de las tareas: ");
                double tareas = sc.nextDouble();
        
                System.out.print("Ingresa la nota de participación: ");
                double participacion = sc.nextDouble();
        
                double notaFinal = (examenes * 0.4) + (proyectos * 0.3) + (tareas * 0.2) + (participacion * 0.1);
        
                System.out.println("La nota final es: " + notaFinal);
            }
        }
