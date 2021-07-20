/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class EjemploDoWhile1 {
    public static void main(String[] args) {
        // Hacer un programa que sume los numeros entre 100 y 200
           
        // Ciclo se ejecuta una vez
        do {
            System.out.println("Ciclo do while 1");
        } while(false);
        System.out.println("Pasa 1");
        
        // Ciclo se ejecuta una vez
        int i = 10;
        do {
            System.out.println("Ciclo do while 2");
            i--;
        } while(i > 10);
        System.out.println("Pasa 2 y el valor de i queda como " + i);
    }
    
}
