import java.util.Scanner;

public class AppPunto {
    public static void main(String[] args) {
        
        
        // Hacer un programa que solicite 2 puntos. Los muestre en pantalla y calcule la distancia 
        // entre ellos y muestre el punto medio.
        double xIn, yIn;
        double d;
        Punto P1, P2, M;
        
        
        // Objeto para leer datos
        Scanner input = new Scanner(System.in);
        // Solicitar datos del primer punto
        System.out.println("Primer punto");
        System.out.print("-> x: ");
        xIn = input.nextDouble();
        System.out.print("-> y: ");
        yIn = input.nextDouble();
        P1 = new Punto(xIn, yIn);
        System.out.print("\nPunto ingresado: ");
        P1.printCoords();
        
        // Solicitar datos del segundo punto
        System.out.println("Segundo punto");
        System.out.print("-> x: ");
        xIn = input.nextDouble();
        System.out.print("-> y: ");
        yIn = input.nextDouble();
        P2 = new Punto(xIn, yIn);
        System.out.print("\nPunto ingresado: ");
        P2.printCoords();
        
        // Calcular distancia
        d = P1.calcularDistancia(P2); // d = P2.calcularDistancia(P1);
        
        // Obtener el punto medio
        M = P1.obtenerPuntoMedio(P2);
        
        // Mostranto resultados
        System.out.println("RESULTADOS\n");
        System.out.println("- La distancia entre los puntos es: " + d);
        System.out.print("- El punto medio entre los puntos es: ");
        M.printCoords();
    }    
}

