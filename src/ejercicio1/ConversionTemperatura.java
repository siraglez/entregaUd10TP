package ejercicio1;

import java.util.Scanner;

public class ConversionTemperatura {

    //Función para convertir la temperatura
    public static double convertirTemperatura (double temperatura, String unidad) throws IllegalArgumentException {
        //Lanzar una excepción si la temperatura está por debajo del cero absoluto
        if ((unidad.equals("C") && temperatura < -273.15) || (unidad.equals("F") && temperatura < -459.67)) {
            throw new IllegalArgumentException("La temperatura está por debajo del cero absoluto");
        }

        //Convertir de Celsius a Farenheit
        if (unidad.equals("C")) {
            return (temperatura * 9/5) + 32;
        }
        //Convertir de Farenheit a Celsius
        else if (unidad.equals("F")) {
            return (temperatura - 32) * 5/9;
        }
        //Si la unidad no es reconocida, lanzar una excepción
        else {
            throw new IllegalArgumentException("La unidad de temperatura no es válida.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducir la temperatura: ");
        double temperatura = scanner.nextDouble();
        scanner.nextLine(); //Consumir la nueva línea pendiente

        System.out.println("Elegir la unidad de temperatura (C/F): ");
        String unidad = scanner.nextLine().toUpperCase();

        try {
            //Llamar a la función convertirTemperatura y mostrar el resultado
            double resultado = convertirTemperatura(temperatura, unidad);
            System.out.println(temperatura + unidad + " = " + resultado + (unidad.equals("C") ? "ºF" : "ºC"));
        } catch (IllegalArgumentException e) {
            //Capturar y mostrar el mensaje de la ecepción
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}