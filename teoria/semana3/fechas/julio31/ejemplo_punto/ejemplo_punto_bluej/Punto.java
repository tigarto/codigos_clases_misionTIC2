public class Punto {

    // Atributos
    private double x;
    private double y;
    public static int numeroPuntos = 0;  // Cada que se agrega un punto se aumenta en 1

    // Constructores
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
        numeroPuntos++;
    }

    public Punto() {
        /*
        this.x = 0;
        this.y = 0;
        numeroPuntos++;
         */
        this(0, 0);  // this = self = Objeto actual (Punto)
    }

    public Punto(double l) {
        /*
        this.x = 0;
        this.y = 0;
        numeroPuntos++;
         */
        this(l, l);  // this = self = Objeto actual (Punto)
    }

    public Punto(Punto p) {
        // Constructor copia
        this.x = p.x;
        this.y = p.y;
        numeroPuntos++;
    }

    // Metodos
    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    public void printCoords() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }

    public double calcularDistancia(double x, double y) {
        double d;
        d = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return d;
    }
    
    public double calcularDistancia(Punto p) {
        double d;
        // d = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
        d = calcularDistancia(p.x, p.y);
        return d;
    }

    public double calcularDistanciaOrigen() {
        //return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double d = calcularDistancia(0, 0);
        return d;
    }
    
    public static void imprimirTotalPuntos() {
        System.out.println("Hay en total " + numeroPuntos + " puntos");
    }
}
