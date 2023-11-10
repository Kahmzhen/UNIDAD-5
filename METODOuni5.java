/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodouni5;

/**
 *
 * @author ce182
 */
public class METODOuni5 {

     public static void main(String[] args) {
        int n1 = 25;
        int n2 = 14;

        System.out.println("Suma: " + suma(n1, n2));
        System.out.println("Resta: " + resta(n1, n2));
        System.out.println("Multiplicación: " + multiplicacion(n1, n2));
        System.out.println("División: " + division(n1, n2));
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: división por cero.");
            return 0;
        }
    }
}
