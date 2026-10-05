/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmosrecursivos;
import javax.swing.JFrame;
/**
 *
 * @author humbe
 */
public class VentanaRectangulo extends JFrame {
    
public VentanaRectangulo(int ancho, int alto) {

        setTitle("Rectángulo Recursivo");

        setSize(ancho + 150, alto + 150);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLocationRelativeTo(null);

        add(new Rectangulo(ancho, alto));
    }
}
