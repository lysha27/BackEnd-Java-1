/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10guiateo5;

import java.util.Scanner;

/**
 *
 * @author lysha
 */
public class Ej10guiateo5 {

    /**
     * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e
     * imprima el número ingresado seguido de tantos asteriscos como indique su
     * valor
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, j, num1;
        System.out.println("Ingrese cuatro numeros del 1 al 20");
        for (i = 0; i < 4; i++) {
            num1 = leer.nextInt();
            while ((num1 <0) || (num1>20)){
                System.out.println("Su número no es válido, intente nuevamente ");
                num1 = leer.nextInt();
             }
            System.out.print(num1+": ");
             for (j=0; j<num1;j++){
                 System.out.print("*");
             }
             System.out.println(" ");    
        }

    }

}
