/**
 *
 * @author Usuario
 */
public class Square {
    /** Atributos */
    private double side;
    
    /** Constructores */
    public Square() {
        side = 1;
    }
    
    public Square(double side) {
        this.side = side;
    }
    
    // Constructor copia
    public Square(Square c) {
        side = c.side;
    }
    
    /** Metodos */

    /**
     * @return the side
     */
    public double getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(double side) {
        this.side = side;
    }
        
    public double perimeter() {
        return 4*side;
    }
    
    public double area() {
        return Math.pow(side, 2);
    }   
}
