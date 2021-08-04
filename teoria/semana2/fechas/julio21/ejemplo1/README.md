# Ejemplo #

* **Fecha**: Codigo que modela un rectangulo y la prueba.

## Código ##

* **Archivo 1**: [Rectangle.java](Rectangle.java)

```java
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
```

* **Archivo 2**: [ConstructorDemo.java](ConstructorDemo.java)

```java
public class ConstructorDemo {    
  public static void main(String[] args) {      
    Rectangle box = new Rectangle(5.0, 15.0);               
    System.out.println("The box's length is " + box.getLength());      
    System.out.println("The box's width is " + box.getWidth());      
    System.out.println("The box's area is " + box.getArea());    
  }
}
```
