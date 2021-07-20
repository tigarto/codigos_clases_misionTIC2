/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class EjemploWhile2 {
    public static void main(String[] args) {
        // Hacer un programa que sume los numeros entre 100 y 200
        final int NUM_INICIAL = 100;
        final int NUM_FINAL = 200;        
        int i = NUM_INICIAL;
        int sum = 0; // Acumulador (Suma de los numeros)
        
        
        
        while (i <= NUM_FINAL) {            
            sum += i;
            i++; 
        }
        System.out.println("suma desde " + NUM_INICIAL + " hasta " + NUM_FINAL + " es: " + sum);
    }
    
}
