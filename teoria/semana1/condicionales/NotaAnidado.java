/**
 * @source name: NotaAnidado.java
 * @author misionTIC2
 */
import java.util.Scanner;

public class NotaAnidado {

    public static void main(String[] args) {
        // Variables
        float score;
        char grade;

        // Objeto tipo Scanner
        Scanner input = new Scanner(System.in);  // Scanner

        //Ingreso de la nota numerica
        System.out.print("Ingrese la nota numerica (dentro del rango [0,100]): ");
        score = input.nextFloat();

        // Validación de la nota numerica y obtencion de la nota en letras dependiendo la tabla
        if (score >= 90.0) {
            grade = 'A';
        } else {
            if (score >= 80.0) {
                grade = 'B';
            } else {
                if (score >= 70.0) {
                    grade = 'C';
                } else {
                    if (score >= 60.0) {
                        grade = 'D';
                    } else {
                        grade = 'F';
                    }
                }
            }
        }
        System.out.println(score + " -> " + grade);
    }
}
