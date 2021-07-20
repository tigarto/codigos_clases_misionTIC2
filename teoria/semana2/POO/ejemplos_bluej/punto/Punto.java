
class Punto {
    /* Miembors */
    private double x;
    private double y;

    public Punto() {
        x = 0;   // this.x = 0
        y = 0;   // this.x = 0
    }
        
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void printCoords() {
        System.out.println("(" + x + ", " + y +")");
    }

    public double calculateDistance(double x, double y) {
        double d;
        d = Math.sqrt(Math.pow(this.x - x, 2) +
                      Math.pow(this.y - y, 2));
        return d;  
    }

    public double calculateDistance(Punto p) {
        double d;
        d = Math.sqrt(Math.pow(this.x - p.x, 2) +
                      Math.pow(this.y - p.y, 2));
        return d;
    }
}