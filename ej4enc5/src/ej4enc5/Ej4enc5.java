/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4enc5;

import java.util.Scanner;

/**
 *
 * @author lysha
 */
public class Ej4enc5 {

    /**
     * Escriba un programa que pida una frase o palabra y valide si la primera
     * letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá
     * de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
     * contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
     * Substring y equals() de Java.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra");
        String frase = leer.nextLine();
        String letra = frase.substring(0, 1);
        while (letra.equalsIgnoreCase("a") == false) {
            System.out.println("INCORRECTO");
            System.out.println("Ingrese una frase o palabra");
            frase = leer.nextLine();
            letra = frase.substring(0, 1);

        }
        System.out.println("CORRECTO");
    }
}
