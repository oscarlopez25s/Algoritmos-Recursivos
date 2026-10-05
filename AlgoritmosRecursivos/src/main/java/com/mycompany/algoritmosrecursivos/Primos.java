/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmosrecursivos;

/**
 *
 * @author humbe
 */
public class Primos {
    
   public static boolean PrimoSi(int num, int division) {

        if (num < 2) {
            return false;
        }

        if (division * division > num) {
            return true;
        }

        if (num % division == 0) {
            return false;
        }

        return PrimoSi(num, division + 1);
    }

    public static String VerPrimos(int actual, int n) {

        if (actual > n) {
            return "";
        }

        if (PrimoSi(actual, 2)) {
            return actual + " " + VerPrimos(actual + 1, n);
        }

        return VerPrimos(actual + 1, n);
    }
}
