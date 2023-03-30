/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4clase3;

import java.util.Scanner;


/**
 *Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author lysha
 */
public class Ej4Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese una temperatura");
            double tempc = leer.nextDouble();
            double tempf = 32 + (9*tempc/5);
            System.out.println("La temperatura en Fahrenheit es " + tempf);
            
    
}
}
