/*
Ejemplo:
Hacer un programa que pida 2 numeros reales y los sume, reste, multiple y divida

 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Ejemplo1 {

    public static void main(String[] args) {
        /** Declaracion de variables **/
        double num1, num2, resultado;
        
        // 
        Scanner entrada = new Scanner(System.in);
        
        
        /** Logica del programa **/
        
        // Pedir los datos
        /**
         * Python
         * num1 = float(input("Digite el primer numero"))
         * num2 = float(input("Digite el primer numero"))
         **/
        
        // num1 = float(input("Digite el primer numero"))
        System.out.print("Digite el primer numero: ");
        num1 = entrada.nextDouble();
        System.out.print("Digite el segundo numero: ");
        num2 = entrada.nextDouble();
        
        // Operaciones
        resultado = num1 + num2; // Suma
        System.out.println(num1 + " + " + num2 + " = " + resultado);
        
        resultado = num1 - num2; // Resta
        System.out.println(num1 + " - " + num2 + " = " + resultado);
        
        // multiplicacion
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2)); //
        
        // Division
        resultado = num1/num2;
        System.out.println(num1 + " / " + num2 + " = " + resultado);
        
    }
}
    
