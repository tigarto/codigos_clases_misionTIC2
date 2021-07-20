/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class EjemploWhileInfinito {
    public static void main(String[] args) {
        // Hacer un programa que sume los numeros entre 100 y 200
        // Ciclo 
        int x = 20;
        while(x > 0) {
            System.out.println(x);
            x--;  // x = x - 1
        }
        // Ciclo inifinito
        while(true) {
            System.out.println("infinito");
        }
        
    }
    
}
