/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class EjemploWhile1 {    
    public static void main(String[] args) {
        // Hacer un programa que cuente desde 1 hasta 10
        
        /* Python
        i = 1
        while i <= 10:
          print("i =",i)
          i += 1
        */
        
        // Java
        int i = 1;
        while (i <= 10) {
            System.out.println("i = " + i);
            i++; // i += 1;             
        }
        System.out.println("\nCiclo descendente");
        i = 100;
        while (i >= 0) {
            System.out.println("i = " + i);
            i -= 10; // i += 1;             
        }
        System.out.println("\nCiclo con caracteres");
        int j = 0;
        while(j < 10) {
            // Se ejecuta 10 veces
            if(j%2 == 0) {
                // j par
                System.out.println("+");
            }        
            else {
                System.out.println("-");
            }
            j++;
        }  
    }    
}
