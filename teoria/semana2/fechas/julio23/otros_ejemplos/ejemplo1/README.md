# Ejemplo #

* **Fecha**: 23/07/2021

## Código ##

Codigo que modela un rectangulo

* **Archivo 1**: [Rectangle.java](Rectangle.java)

```java
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
```

* **Archivo 2**: [RectangleDemo.java](RectangleDemo.java)

```java
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle box = new Rectangle();
        
        box.setLength(10.0);
        box.setWidth(20.0);
        System.out.println("The box's length is " + box.getLength());
        System.out.println("The box's width is " + box.getWidth());
        System.out.println("The box's area is " + box.getArea());
    }
}
```
