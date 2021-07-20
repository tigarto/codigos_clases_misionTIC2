
import java.util.Scanner;
import java.lang.Math;

public class ExampleIO13 {

    public static void main(String[] args) {
        // Declaracion de variables y objetos
        int dec, unid, num, numInv;
        Scanner key = new Scanner(System.in);
        
        
        // Vamos a pedir el numero sin mensaje
        //System.out.print("Digite el numero: ");
        num = key.nextInt(); // Se pidio el numero
        dec = num / 10;
        unid = num % 10;
        numInv = unid * 10 + dec;
        // Programa
        System.out.print("-> Respuesta: " + numInv + "\n");
    }
}
