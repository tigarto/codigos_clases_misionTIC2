/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class EjemploWhileVacio {
    public static void main(String[] args) {
        // Hacer un programa que sume los numeros entre 100 y 200
           
        // Ciclo que no se ejecuta
        while(false) {
            System.out.println("No pasa por aca");
        }
        System.out.println("Pasa 1");
        
        // Ciclo que no se ejecuta 2
        int i = 10;
        while(i > 10) {
            System.out.println("No pasa por aca tampoco");
            i--;
        }
        System.out.println("Pasa 2");
    }
    
}
