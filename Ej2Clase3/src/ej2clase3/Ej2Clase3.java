/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2clase3;

import java.util.Scanner;

/**
 *
 * @author lysha
 */
public class Ej2Clase3 {

    /**
     * @param args the command line arguments
     *  
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("Su nombre es " + nombre);
    }
    
}
