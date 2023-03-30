/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejteorico6;

import java.util.Scanner;

/**
 *
 * @author lysha
 */
public class EjTeorico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Ingrese un numero");
    Scanner leer1 = new Scanner(System.in);
    int num1 = leer1.nextInt();
    System.out.println("Ahora ingrese otro numero");
    int num2 = leer1.nextInt();
    if ((num1>25) || (num2>25)){
        System.out.println("Alguno de los numeros es mayor a 25");
    }else {System.out.println("Ninguno de los numeros ingresados es mayor 25");
    }
          
    }
    
}
    

