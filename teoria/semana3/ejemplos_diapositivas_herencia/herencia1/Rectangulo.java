public class Rectangulo { 
  private double longitud;
  private double ancho;
  
  public Rectangulo() {
    longitud = 0;
    ancho = 0;
  }
  public Rectangulo(double longitud, double ancho) {
    setDimension(longitud, ancho);
  }
  
  public void setDimension(double longitud, double ancho)  {
    if (longitud >= 0)
      this.longitud = longitud;
    else
      this.longitud = 0;
    if (ancho >= 0)
      this.ancho = ancho;
    else
      this.ancho = 0;
  }
  
  public double getLongitud() {
    return longitud;
  }
  
  public double getAncho() {
    return ancho;
  }
  
  public double area() {
    return longitud * ancho;
  }

  public double perimetro() {
    return 2 * (longitud + ancho);
  }

  public String toString() {
    return ("Longitud = " + longitud + "; Ancho = " + ancho);
  }
}