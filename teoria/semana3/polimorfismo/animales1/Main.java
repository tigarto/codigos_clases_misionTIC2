class Main {
  public static void main(String[] args) {
    Animal animales[] = new Animal[5];
    animales[0] = new Animal();
    animales[1] = new Pez();
    animales[2] = new Rana();
    animales[3] = new Ave();
    animales[4] = new Tortuga();
    for(Animal animal: animales) {
      animal.mover();
    }
  }
}