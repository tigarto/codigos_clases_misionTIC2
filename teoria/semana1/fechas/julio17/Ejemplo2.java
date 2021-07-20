/*
 * Hacer un programe pida el nombre de una persona y su edad y los imprima con un saludo
 */

/**
 *
 * @author Usuario
 */

import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        /* Declaracion de variables */
        String nombre;
        int edad;
        
        // Scanner --> Teclado
        Scanner input = new Scanner(System.in);
        
        /* Logica del programa*/
        
        // Solicitud de datos
        System.out.print("Nombre: ");
        nombre = input.next();
        System.out.print("Edad: ");
        edad = input.nextInt();
        
        // Despliegue del mensaje
        System.out.println("Hola " + nombre + " tienes " + edad + " primaveras");
        
        
    }    
}
