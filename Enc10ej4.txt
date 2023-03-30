/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4enc10;

import java.util.Scanner;

/**
 *
 * @author lysha
 */
public class Ej4Enc10 {

    /**
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
     * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
     * A se denota por B y se obtiene cambiando sus filas por columnas (o
     * viceversa).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matrix = new int[4][4];
        int[][] matrixDos = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrixDos[i][j] = matrix[j][i];
            }
        }
        System.out.println(" La matrix original es: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" [ " + matrix[i][j] + " ] ");
            }
            System.out.println(" ");

        }
        System.out.println(" ");
        System.out.println(" La matrix transpuesta es: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" [ " + matrixDos[i][j] + " ] ");
            }
            System.out.println(" ");
        }
    }
}
