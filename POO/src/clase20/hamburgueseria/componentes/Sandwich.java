package clase20.hamburgueseria.componentes;

public class Sandwich extends Producto {

    // Constructor
    public Sandwich(String nombre, double costo) {
        super(nombre, costo);
    }


    // Métodos
    @Override
    public double calcularPrecio() {
        return this.getCosto() + (this.getCosto() / 100 * this.getPORCENTAJE_DE_GANANCIA());
    }
}
