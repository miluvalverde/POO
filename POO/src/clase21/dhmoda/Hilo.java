package clase21.dhmoda;

public class Hilo extends Producto {

    @Override
    public double calcularPrecio() {
        return this.getPrecio() + (this.getPrecio() * getMargenDeGanancia() / 100);
    }

}
