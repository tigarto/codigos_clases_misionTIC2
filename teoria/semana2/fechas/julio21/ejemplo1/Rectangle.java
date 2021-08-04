/**
 *
 * @author MisionTIC
 */
public class Rectangle {
    // Atributos
    private double length;
    private double width;

    // Constructores
    public Rectangle() {
        length = 0.0;
        width = 0.0;
    }
    
    public Rectangle(double len, double w) {
        length = len;
        width = w;
    }
    
    // Metodos
    public double getLength() {
        return length;
    }

    public void setLength(double len) {
        length = len;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        width = w;
    }
    
    public double getArea() {
        return length*width;
    }
}
