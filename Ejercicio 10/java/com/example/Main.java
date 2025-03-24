package com.example;

public class Main {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        
                System.out.print("Ingresa el primer número: ");
                double num1 = sc.nextDouble();
        
                System.out.print("Ingresa el segundo número: ");
                double num2 = sc.nextDouble();
        
                System.out.print("Ingresa el operador (+, -, *, /): ");
                char operador = sc.next().charAt(0);
        
                double resultado;
        
                switch (operador) {
                    case '+':
                        resultado = num1 + num2;
                        break;
                    case '-':
                        resultado = num1 - num2;
                        break;
                    case '*':
                        resultado = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Error: No se puede dividir por cero.");
                            return;
                        } else {
                            resultado = num1 / num2;
                        }
                        break;
                    default:
                        System.out.println("Operador no válido.");
                        return;
                }
        
                System.out.println("El resultado es: " + resultado);
            }
        }

