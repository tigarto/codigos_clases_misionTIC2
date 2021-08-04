
class Student {
  private String name;
  private String id;
  private double grade;
  public static int numStudents = 0;
  
  public Student(String pName, String pId) {
    name = pName;
    id = pId;
    grade = 0.0;
    numStudents++;
  }
  
  public void setGrade(double pGrade) {
    grade = pGrade;    
  }
  
  public void printInfo() {
    System.out.println("- Nombre: " + name);
    System.out.println("- Carnet: " + id);
    System.out.println("- Nota: " + grade);
  }
  
}