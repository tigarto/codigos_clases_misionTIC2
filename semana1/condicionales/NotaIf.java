
/**
 * @source name: NotaIf.java
 * @author misionTIC2
 */

import java.util.Scanner;

public class NotaIf {

    public static void main(String[] args) {
        /* Declaracion de variables */
        String nombre;
        float nota;
        String estado = "perdida";
        // Uso Clase Scanner para entrar dados por teclado
        Scanner input = new Scanner(System.in);
        
        /* Programa */
        // Entrada de datos
        System.out.print("Digite su nombre: ");
        nombre = input.next();
        System.out.print("La nota: ");
        nota = input.nextFloat();
        if(nota >= 3) {
            estado = "ganada";
        }
        System.out.println(nombre + " usted " + estado + " la materia");
    }
    
}
