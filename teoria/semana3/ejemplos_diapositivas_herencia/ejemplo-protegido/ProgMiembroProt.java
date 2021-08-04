public class ProgMiembroProt {
    public static void main(String[] args) {
        BClass bObject = new BClass(); 
        DClass dObject = new DClass(); 
        System.out.println("Linea 3: " + bObject); 
        System.out.println("Línea 4: *** "
                           + "Objeto subclase ***"); 
        dObject.setDatos('&', 2.5, 7); //Linea 5
        System.out.println("Linea 6: " + dObject); 
    }
}