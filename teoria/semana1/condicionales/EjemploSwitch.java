/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {
        /* Declaracion de variables */
        char calificacion;
        
        // Objeto tipo Scanner
        Scanner input = new Scanner(System.in);  
        
        /* Programa */
        // Entrada de datos
        System.out.print("Digite la letra asociada a la nota (A, B, C, D o F): ");
        calificacion = input.next().charAt(0);
        switch (calificacion) {
            case 'A':
                System.out.println("La calificacion es A.");
                break;
            case 'B':
                System.out.println("La calificacion es B.");
                break;
            case 'C':
                System.out.println("La calificacion es C.");
                break;
            case 'D':
                System.out.println("La calificacion es D.");
                break;
            case 'F':
                System.out.println("La calificacion es F.");
                break;
            default:
                System.out.println("La calificacion es invalida.");
        }    
    }    
}
