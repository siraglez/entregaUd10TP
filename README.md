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
