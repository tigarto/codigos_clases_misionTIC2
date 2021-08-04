public class Main {
  public static void main(String[] args) {
    Person persona, personaRef;
    EmpTiempoParcial empleado, empleadoRef; 
    persona = new Person("Pedro", "Picapiedra"); 
    System.out.println("personaRef: " + persona);  
    empleado = new EmpTiempoParcial("Super", "Sonico", 12.50, 45);
    personaRef = empleado; 
    System.out.println("personaRef: " + personaRef); 
  }
}