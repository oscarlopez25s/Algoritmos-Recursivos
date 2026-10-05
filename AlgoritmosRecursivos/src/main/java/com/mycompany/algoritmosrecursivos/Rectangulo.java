/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmosrecursivos;
import javax.swing.JPanel;
import java.awt.Graphics;
/**
 *
 * @author humbe
 */
public class Rectangulo extends JPanel{
       
    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        dibujarRectangulo(g, 50, 50, ancho, alto, 0);
    }

    private void dibujarRectangulo(Graphics g, int x, int y,
                                   int ancho, int alto, int linea) {

        // Caso base
        if (linea > alto) {
            return;
        }

        // Dibujamos una línea
        g.drawLine(x, y + linea, x + ancho, y + linea);

        // Parte recursiva
        dibujarRectangulo(g, x, y, ancho, alto, linea + 1);
    }
}
