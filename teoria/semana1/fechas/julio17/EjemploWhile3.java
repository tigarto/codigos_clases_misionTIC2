/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class EjemploWhile3 {
    public static void main(String[] args) {
        // Hacer un programa que sume los numeros entre 100 y 200
        final int NUM_INICIAL = 1;
        final int NUM_FINAL = 100;        
        int i = NUM_INICIAL;
        
    
        while (i <= NUM_FINAL) {            
            System.out.print(i + " ");
            i*=2;  // i = i*2; 
        }
        System.out.println("");
        
    }
    
}
