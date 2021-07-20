/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class EjemploFor2 {
    public static void main(String[] args) {
        int i = 1; // Una variable solo se declara una vez
        // Ejemplo con while
        System.out.println("Ciclo while");
        
        while(i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        
        // Ejemplo do while
        System.out.println("Ciclo do while");
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while(i <= 10);
        System.out.println();
        
        // Ejemplo for
        System.out.println("Ciclo for");
        for (i = 1; i <= 10; i++) {
            System.out.print(i + " ");                        
        }
        System.out.println();
    }
    
}
