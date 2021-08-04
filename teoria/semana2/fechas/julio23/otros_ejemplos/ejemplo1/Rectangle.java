public class Rectangle {
  // Atributos
  private double length;
  private double width;

  // Metodos
  public void setLength(double len) {
    length = len;
  }

  public void setWidth(double w) {	
    width = w;
  }

  public double getLength() {	
    return length;
  }
 
  public double getWidth() {	
    return width;
  }
  
  public double getArea() {	
    return width*length;
  }
}
