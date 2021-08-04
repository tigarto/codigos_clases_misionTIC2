
public class Prueba {
  public static void main(String[] args) {
    Person persona1 = new Person();
    Person persona2 = new Person("Pedro", "Picapiedra"); 
    System.out.println("persona1: " + persona1); 
    persona1.setNombre("Pablo", "Marmol"); 
    System.out.println("persona1: " + persona1); 
    System.out.println("persona2: " + persona2); 
    persona2.setNombre("Cometin", "Sonico"); 
    System.out.println("persona2: " + persona2); 
    EmpTiempoParcial empleado1 = new EmpTiempoParcial("Super","Sonico",1000,160);
    System.out.println("empleado1: " + empleado1); 
  }
}