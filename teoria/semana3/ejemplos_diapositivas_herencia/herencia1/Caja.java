
public class Caja extends Rectangulo {
  private double altura; 
  
  public Caja() {
    super();
    altura = 0;
  }
  
  public Caja(double longitud, double ancho, double altura) {
    super(longitud, ancho);
    this.altura = altura;
  }
  
  public void setDimension(double longitud, double ancho, double altura) {
    super.setDimension(longitud, ancho);
    if (altura >= 0) {
      this.altura = altura;
    }
    else {
      this.altura = 0;
    }
  }
  
  public double getAltura() {
    return altura;
  }
  
  public double perimetro() {
    return 8 * (getLongitud() + getAncho() + altura);
  }
  
  public double area() {
    return 2 * (getLongitud() * getAncho() + 
                getLongitud() * altura + 
                getAncho() * altura);
  }
  
  public double volumen() {
    return super.area()*altura;
  }
  
  public String toString() {
    return super.toString() + "; Height = " + altura;
  }
}
