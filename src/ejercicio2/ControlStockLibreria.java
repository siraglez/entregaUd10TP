package ejercicio2;

import java.util.Scanner;

//Clase principal para controlar el stock
public class ControlStockLibreria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libro libro = new Libro();

        System.out.println("Introducir el ISBN del libro: ");
        String isbn = scanner.nextLine();
        System.out.println("ISBN " + isbn);

        while (true) {
            System.out.println("¿Qué desea hacer?: añadir, quitar, consultar, salir");
            String accion = scanner.nextLine();

            try {
                if (accion.equals("añadir")) {
                    System.out.println("Introducir cantidad a añadir: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine(); //Consumir la nueva línea pendiente
                    libro.agregarStock(cantidad);
                } else if (accion.equals("quitar")) {
                    System.out.println("Introducir cantidad a quitar: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine(); //Consumir la nueva línea pendiente
                    libro.quitarStock(cantidad);
                } else if (accion.equals("consultar")) {
                    System.out.println("Libro con ISBN: " + isbn + " - Stock actual: " + libro.consultarStock());
                } else if (accion.equals("salir")) {
                    break;
                } else {
                    System.out.println("Acción no reconocida. Por favor, introduzca una opción válida.");
                }
            } catch (ExceptionStockDesbordado e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
