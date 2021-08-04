public class Person {
  private String nombre1; 
  private String apellido1; 
  
  public Person() {
    nombre1 = "";
    apellido1 = "";
  }
  
  public Person(String nombre, String apellido) {
    setNombre(nombre, apellido);
  }

  public String toString() {
    return (nombre1 + " " + apellido1);
  }

  public void setNombre(String nombre, String apellido) {
    nombre1 = nombre;
    apellido1 = apellido;
  }

  public String getNombre() {
    return nombre1;
  }

  public String getApellido() {
    return apellido1;
  }
}