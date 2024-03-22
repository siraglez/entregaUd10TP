package ejercicio2;

public class ExceptionStockDesbordado extends Exception {
    public ExceptionStockDesbordado() {
        super("El stock del libro excede la capacidad de este sistema.");
    }
}
