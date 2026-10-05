/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmosrecursivos;

/**
 *
 * @author humbe
 */
public class Binarios {
    
    public static String decimalBinario(int num) {

        if (num < 2) {
            return String.valueOf(num);
        }

        return decimalBinario(num / 2) + (num % 2);
    }
}
