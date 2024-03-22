link al repositorio: https://github.com/siraglez/entregaUd10TP.git

# Ejercicio 1: Conversor de Temperatura

Este programa en Java implementa un conversor de temperatura que convierte una temperatura dada por el usuario de Celsius a Fahrenheit o viceversa, según la unidad especificada.

## 1. Funcionamiento

### 1.1. Método `convertirTemperatura`:

- Este método toma la temperatura y la unidad de temperatura como parámetros.
- Si la temperatura está por debajo del cero absoluto (-273.15°C o -459.67°F), lanza una excepción de tipo `IllegalArgumentException`.
- Luego, realiza la conversión de Celsius a Fahrenheit o de Fahrenheit a Celsius según corresponda y devuelve el resultado.

### 1.2. Método `main`:

- Punto de entrada del programa. Solicita al usuario introducir la temperatura y la unidad de temperatura deseada (Celsius o Fahrenheit).
- Se intenta llamar al método `convertirTemperatura` con los valores proporcionados por el usuario.
- Si la conversión tiene éxito, muestra el resultado en la consola.
- Si ocurre un error durante la conversión, se muestra un mensaje de error correspondiente.

## 2. Pseudocódigo

```java
Clase ConversionTemperatura
Función convertirTemperatura(temperatura, unidad)
    Si (unidad = "C" y temperatura < -273.15) o (unidad = "F" y temperatura < -459.67) Entonces:
        Lanzar una excepción con el mensaje "La temperatura está por debajo del cero absoluto."
    Fin si

    Si unidad = "C" Entonces:
        Devolver (temperatura * 9/5) + 32
    Sino Si unidad = "F" Entonces:
        Devolver (temperatura - 32) * 5/9
    Sino
        Lanzar una excepción con el mensaje "La unidad de temperatura no es válida."
    Fin si

Algoritmo Main
Imprimir "Introducir la temperatura: "
Leer temperatura
Consumir la nueva línea pendiente

Imprimir "Elegir la unidad de temperatura (C/F): "
Leer unidad
unidad <- Convertir a mayúsculas(unidad)

Intentar:
    resultado <- convertirTemperatura(temperatura, unidad)
    Imprimir temperatura + unidad + " = " + resultado + (Si unidad = "C" Entonces: "ºF" Sino "ºC")
Capturas excepción IllegalArgumentException como e
    Imprimir e.getMessage()
Fin intentar
```


# Ejercicio 2: Gestión de Stock de Librería

## 1. Clase `Libro`

- Representa un libro y su stock en la librería.
- Atributos:
  - `stock`: cantidad de libros disponibles.
- Métodos:
  - `Libro()`: constructor que inicializa el stock del libro en 0.
  - `agregarStock(int cantidad)`: añade una cantidad determinada de libros al stock actual. Lanza una excepción si se supera el rango permitido para un entero.
  - `quitarStock(int cantidad)`: reduce el stock del libro en una cantidad determinada. Lanza excepciones si la operación resulta en un stock negativo o si provoca un desbordamiento.
  - `consultarStock()`: devuelve el valor actual del stock del libro.

## 2. Clase `ControlStockLibreria`

- Clase principal que controla la interacción con el usuario.
- Funciona como una interfaz para gestionar el stock de un libro.
- Utiliza un objeto `Scanner` para leer la entrada del usuario desde la consola.
- Permite al usuario realizar las siguientes acciones: añadir, quitar, consultar o salir.
- Captura y maneja excepciones que puedan ocurrir durante las operaciones de gestión de stock.
- El bucle de interacción se repite hasta que el usuario decide salir.
- Finalmente, cierra el objeto `Scanner`.

## 3. Uso

Para utilizar el sistema, simplemente ejecuta la clase `ControlStockLibreria`. El sistema te guiará a través de las opciones disponibles para gestionar el stock del libro.

## 4. Pseudocódigo

```java
Clase Libro
    Función agregarStock(cantidad) Lanzar ExceptionStickDesbordado
        nuevoStock <- Convertir a largo(stock) + Convertir a largo(cantidad)
        Si nuevoStock > Integer.MAX_VALUE o nuecoStock < Integer.MIN_VALUE Entonces
            Lanzar una excepción con el mensaje "El stock del libro excede la capacidad de este sistema."
        Fin si
        stock <- stock + cantidad

    Función quitarStock(cantidad) Lanzar ExceptionStickDesbordado
        nuevoStock <- Convertir a largo(stock) - Convertir a largo(cantidad)
        Si nuevoStock > Integer.MAX_VALUE o nuevoStock < Integer.MIN_VALUE Entonces
            Lanzar una excepción con el mensaje "El stock del libro excede la capacidad de este sistema."
        Fin si
        Si stock - cantidad < 0 Entonces
            Lanzar una excepción con el mensaje "No se puede reducir el stock por debajo de cero."
        Fin si
        stock <- stock - cantidad

    Función consultarStock()
        Devolver stock

Clase ControlStockLibreria
    Función Main()
        Imprimir "Introducir el ISBN del libro: "
        isbn <- Leer línea desde el scanner
        Imprimir "ISBN " + isbn

        Mientras verdadero Hacer
            Imprimir "¿Qué desea hacer?: añadir, quitar, consultar, salir"
            accion <- Leer línea desde el scanner

            Intentar
                Si accion es igual a "añadir" Entonces
                    Imprimir "Introducir cantidad a añadir: "
                    cantidad <- Leer entero desde el scanner
                    Llamar a agregarStock(cantidad) del objeto libro
                Sino si accion es igual a "quitar" Entonces
                    Imprimir "Introducir cantidad a quitar: "
                    cantidad <- Leer entero desde el scanner
                    Llamar a quitarStock(cantidad) del objeto libro
                Sino si accion es igual a "consultar" Entonces
                    Imprimir "Libro con ISBN: " + isbn + " - Stock actual: " + llamar a consultarStock() del objeto libro
                Sino si accion es igual a "salir" Entonces
                    Salir del bucle
                Sino
                    Imprimir "Acción no reconocida. Por favor, introduzca una opción válida."
                Fin si
            Capturar ExceptionStockDesbordado como e
                Imprimir e.getMessage()
            Capturar IllegalArgumentException como e
                Imprimir e.getMessage()
            Fin intentar
        Fin mientras

        Cerrar el scanner
```
