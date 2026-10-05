/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmosrecursivos;

/**
 *
 * @author humbe
 */
public class Fibonacci {

    public static int fibonacci(int num) {

        if (num == 0) {
            return 0;
        }

        if (num == 1) {
            return 1;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static String mostrarSerie(int cantidad, int actual) {

        if (actual >= cantidad) {
            return "";
        }

        return fibonacci(actual) + " " + mostrarSerie(cantidad, actual + 1);
    }
}
