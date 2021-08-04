class Punto {
    /* Miembors */
    private double x;
    private double y;

    public Punto() {
        x = 0;   // this.x = 0
        y = 0;   // this.x = 0
    }
        
    public Punto(double xp, double yp) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    
    public void setX(double xp) {
        this.x = xp;
    }

    public double getY() {
        return y;
    }

    public void setY(double yp) {
        this.y = yp;
    }

    public void setXY(double xp, double yp) {
        this.x = xp;
        this.y = yp;
    }

    public void printCoords() {
        System.out.println("(" + x + ", " + y +")");
    }

    public double calculateDistance(double xp, double yp) {
        double d;
        d = Math.sqrt(Math.pow(x - xp, 2) +
                      Math.pow(y - yp, 2));
        return d;  
    }

    public double calculateDistance(Punto p) {
        double d;
        d = Math.sqrt(Math.pow(x - p.x, 2) +
                      Math.pow(y - p.y, 2));
        return d;
    }
}