class Rectangle {
  /** Atributos */
  private double length;
  private double width;
  
  /** Constructores */
  // 1
  public Rectangle() {
    length = 1;
    width = 1;
  }
  // 2 
  public Rectangle(double len, double w) {
    length = len;
    width = w;
  }
  // 3
  public Rectangle(double len) {
    length = len;
    width = len;
  }
  
  // 4
  public Rectangle(Rectangle rec) {
    length = rec.length; // length = rec.getLength();
    width = rec.width;   // width =  rec.getWidth();
  }

  /** Metodos */
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
    return length * width;
  }
}