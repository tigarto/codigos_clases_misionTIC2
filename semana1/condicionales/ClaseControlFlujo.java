/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misionTIC2
 */

import java.util.Scanner;

public class ClaseControlFlujo {

    public static void main(String[] args) {
        /* Declaracion de variables */
        int mes;
        int anio;
        int numeroDias = 0;
        
        // Objeto tipo Scanner
        Scanner input = new Scanner(System.in);  
        
        /* Programa */
        // Entrada de datos
        System.out.print("Digite el mes: ");
        mes = input.nextInt();
        System.out.print("Digite el año: ");
        anio = input.nextInt();
        
        // Determinacion del numero de dias que tiene el mes
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if (((anio % 4 == 0) && !(anio % 100 == 0)) || (anio % 400 == 0)) {
                    // Año bisiesto
                    numeroDias = 29;
                } else {
                    // Año normal
                    numeroDias = 28;
                }
                break;
            default:
                System.out.println("Mes inválido");
                break;
        }
        System.out.println("Número de días = " + numeroDias);
    }
}
