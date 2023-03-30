/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5enc5;

import java.util.Scanner;

/**
 *
 * @author lysha
 */
public class Ej5enc5 {

    /**
     *Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al 
     * usuario hasta que la suma de los números introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese un número límite positivo");
            int limite, num, suma;
            limite = leer.nextInt();
            suma= 0;
            do {
                System.out.println("Ingrese un numero"); 
                num = leer.nextInt();
                suma = suma + num;
              
            
        } while(suma <= limite);
            System.out.println("La suma supero el limite positivo y es:  "+ suma);
        
             
    }
    
}
