public class EmpTiempoParcial extends Person {
  private double salario; 
  private double horasTrabajadas; 
  
  public EmpTiempoParcial() {
    super();
    salario = 0;
    horasTrabajadas = 0;
  }

  public EmpTiempoParcial(String nombre, 
                          String apellido,
                          double remuneracion, 
                          double horas) {
    super(nombre, apellido);
    salario = remuneracion;
    horasTrabajadas = horas;
  }

  public String toString() {
    return (super.toString() + " el sueldo es: $" + calculatePago());
  }

  public double calculatePago() {
    return (salario * horasTrabajadas);
  }

  public void setNombreRemuneracionHoras(String nombre,
                                         String apellido,
                                         double remuneracion, 
                                         double horas) {
    setNombre(nombre, apellido);
    salario = remuneracion;
    horasTrabajadas = horas;
  }

  public double getSalario() {
    return salario;
  }

  public double getHorasTrabajadas() {
    return horasTrabajadas;
  }
}