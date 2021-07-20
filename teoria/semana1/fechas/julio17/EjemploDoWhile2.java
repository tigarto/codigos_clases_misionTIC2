/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class EjemploDoWhile2 {
    public static void main(String[] args) {
        // Hacer un programa que sume los numeros entre 100 y 200
           
        // Implimentacion while
        int i = 0;
        while(i < 10) {
            /*
            System.out.println("(while) i = " + i);
            i++;
            */
            System.out.println("(while) i = " + i++);
        }
        
        // implementacion do while
        System.out.println();
        i = 0;
        do {
            System.out.println("(do...while) i = " + i);
            i++;
        } while(i < 10);    
    }
}
