public class TestFan2 {

    // Imprimir estado
    public static void imprimirEstado(boolean on) {
        if (on) {
            System.out.println("Encendido");
        } else {
            System.out.println("Apagado");
        }
    }

    // Imprimir velocidad
    public static void imprimirVelocidad(int vel) {
        switch (vel) {
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
    }

    // Metodo principal
    public static void main(String[] args) {
        // Creacion de los objetos
        Fan fan1 = new Fan(3, 10, "yellow", true);
        Fan fan2 = new Fan(2, 5, "blue", false);

        // Despliegue de las propiedades (get)
        // fan1
        System.out.println("Propiedades de Fan 1");
        System.out.print("- Velociadad: ");
        imprimirVelocidad(fan1.getSpeed());
        System.out.println("- Radio: " + fan1.getRadius());
        System.out.println("- Color: " + fan1.getColor());
        System.out.print("- Estado: ");
        imprimirEstado(fan1.isON());
        System.out.println();
        // fan1
        System.out.println("Propiedades de Fan 2");
        System.out.print("- Velociadad: ");
        imprimirVelocidad(fan2.getSpeed());
        System.out.println("- Radio: " + fan2.getRadius());
        System.out.println("- Color: " + fan2.getColor());
        System.out.print("- Estado: ");
        imprimirEstado(fan2.isON());
        System.out.println();

    }
}
