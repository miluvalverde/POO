package clase20.hamburgueseria.componentes;

public class Ensalada extends Producto {


    // Constructor
    public Ensalada(String nombre, double costo) {
        super(nombre, costo);
    }

    // Métodos
    @Override
    public double calcularPrecio() {
        return this.getCosto() + (this.getCosto() / 100 * this.getPORCENTAJE_DE_GANANCIA());
    }

}
