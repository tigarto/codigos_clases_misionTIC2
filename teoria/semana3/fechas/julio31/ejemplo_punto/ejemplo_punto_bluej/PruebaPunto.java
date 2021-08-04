
/**
 * Write a description of class PruebaPunto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaPunto
{
    public static void main(String[] args) {
        // Declaracion de variables: dP1P3
        double d1;
        System.out.println("Prueba de la clase punto");
        Punto P1 = new Punto(2, 3);
        Punto P2 = new Punto();
        Punto P3 = new Punto(3);
        Punto P4 = new Punto(P1); // Punto P4 = P1
        Punto P5 = new Punto(P1.getX(),P1.getY()); // Punto P5 = P1
        Punto P6 = new Punto(new Punto(0,2)); // Punto P6(0,2)
        // Mostrando los puntos
        System.out.println("Coordenadas de los puntos creados");
        P1.printCoords();
        P2.printCoords();
        P3.printCoords();
        P4.printCoords();
        P5.printCoords();
        P6.printCoords();
        // Calcular la distancia de P1(2, 3) a P3(3,3)
        d1 = P1.calcularDistancia(P3);          // d1 = P1.calcularDistancia(P3.getX(), P3.getY());  
                                                // d1 = P3.calcularDistancia(P1.getX(), P1.getY());
        System.out.println("La distancia de P1 a P3 es: " + d1);
        // Calcular la distancia de P4(2,3) a x2 = 5 y y2 = 3.4;
        double x2 = 5;
        double y2 = 3.4;
        // double d2 = P4.calcularDistancia(x2, y2);
        System.out.println("La distancia de P1 a (5,3.4) es: " + P4.calcularDistancia(x2, y2));
        // double P5 a (3,0)
        System.out.println("La distancia de P5 a (3,0) es: " + P5.calcularDistancia(3, 0));
        // Calcular la distancia al origen de P6
        // System.out.println("La distancia de P6 a (0,0) es: " + P6.calcularDistancia(0, 0));
        System.out.println("La distancia de P6 a (0,0) es: " + P6.calcularDistanciaOrigen());
        // Invocando una variable estatica (Se invocan con el nombre de la clase)
        int totalPuntos = Punto.numeroPuntos;
        System.out.println("Hay en total: " + totalPuntos + " puntos");
        Punto.imprimirTotalPuntos();  // Llamada o metodo estatico
    }
}
