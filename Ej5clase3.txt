/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5enc3;

import java.util.Scanner;

/**
 *
 * @author lysha
 */
public class Ej5Enc3 {

    /**
     * Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
     * Nota: investigar la función Math.sqrt().
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese un numero entero");
            int num1 = leer.nextInt();
            int doble = num1*2;
            int triple = num1*3;
            double raiz = Math.sqrt(num1);        
            System.out.println("El doble de su numero es:" + doble);
            System.out.println("El triple es: " + triple);
            System.out.println("La raiz cuadrada de su numero " + raiz);
    }
    
}
