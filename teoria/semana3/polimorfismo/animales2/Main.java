class Main {
  public static void main(String[] args) {
    Animal refAnimal;
    Animal animal1 = new Animal();
    Animal ave1 = new Ave();

    refAnimal = animal1; // Referencia de la clase Animal refiriendose a un objeto de la clase animal
                     // (su propia clase)
    refAnimal.mover();
    refAnimal = ave1; // Referencia de la clase Animal refiriendose a un objeto de la clase Ave
                     // (subclase)
    refAnimal.mover();
  }
}