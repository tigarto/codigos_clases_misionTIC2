public class TestFan {
     public static void main(String[] args) {
        // Creacion de los objetos
        Fan fan1 = new Fan(3, 10, "yellow", true);
        Fan fan2 = new Fan(2, 5, "blue", false);
        
        // Despliegue de las propiedades (get)
        // fan1
        System.out.println("Propiedades de Fan 1");
        System.out.print("- Velociadad: ");
        if (fan1.getSpeed() == 1) {
            System.out.println("SLOW");
        }
        else if (fan1.getSpeed() == 2) {
            System.out.println("MEDIUM");     
        }
        else if (fan1.getSpeed() == 3) {
            System.out.println("FAST");     
        }
        System.out.println("- Radio: " + fan1.getRadius());
        System.out.println("- Color: " + fan1.getColor());
        System.out.print("- Estado: ");
        if (fan1.isON()) {
            System.out.println("Encendido");        
        } else {
            System.out.println("Apagado");     
        } 
        System.out.println();
        // fan1
        System.out.println("Propiedades de Fan 2");
        System.out.print("- Velociadad: ");
        /*
        if (fan2.getSpeed() == 1) {
            System.out.println("SLOW");
        }
        else if (fan2.getSpeed() == 2) {
            System.out.println("MEDIUM");     
        }
        else if (fan2.getSpeed() == 3) {
            System.out.println("FAST");     
        }
        */
        switch(fan2.getSpeed()){
            case 1:
                System.out.println("SLOW");
                break;
            case 2:
                System.out.println("MEDIUM");
                break;
            case 3:
                System.out.println("FAST");
                break;
        }
        System.out.println("- Radio: " + fan2.getRadius());
        System.out.println("- Color: " + fan2.getColor());
        System.out.print("- Estado: ");
        if (fan2.isON()) {
            System.out.println("Encendido");        
        } else {
            System.out.println("Apagado");     
        } 
        System.out.println();
         
    }
}
