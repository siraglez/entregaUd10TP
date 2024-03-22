package ejercicio2;

public class Libro {
    private int stock;

    public Libro() {
        this.stock = 0;
    }

    //Método para añadir al stock
    public void agregarStock(int cantidad) throws ExceptionStockDesbordado {
        long nuevoStock = (long) this.stock + (long) cantidad;
        if (nuevoStock > Integer.MAX_VALUE || nuevoStock < Integer.MIN_VALUE) {
            throw new ExceptionStockDesbordado();
        }
        this.stock += cantidad;
    }

    //Método para quitar del stock
    public void quitarStock(int cantidad) throws ExceptionStockDesbordado {
        long nuevoStock = (long) this.stock - (long) cantidad;
        if (nuevoStock > Integer.MAX_VALUE || nuevoStock < Integer.MIN_VALUE) {
            throw new ExceptionStockDesbordado();
        }
        if (this.stock - cantidad < 0) {
            throw new IllegalArgumentException("No se puede reducir el stock por debajo de cero.");
        }
        this.stock -= cantidad;
    }

    //Método para consultar el stock
    public int consultarStock() {
        return this.stock;
    }
}
