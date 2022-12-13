package clase20.hamburgueseria.componentes;

import java.util.ArrayList;

public class ComboComposite extends Producto{

    // Atributos
    private ArrayList<Producto> productos = new ArrayList();
    private double PORCENTAJE_DE_DESCUENTO = 5.0;


    // Constructor
    public ComboComposite(String nombre) {
        super(nombre);
    }


    // Métodos
    @Override
    public double calcularPrecio() {
        double acumulador = 0;
        for (Producto producto : this.productos) {
            acumulador += producto.calcularPrecio();
        }
        return acumulador - (acumulador / 100 * this.getPORCENTAJE_DE_DESCUENTO());
    }

    public void agregarProductos(Producto producto) {
        this.productos.add(producto);
    }

    public void quitarProducto (Producto producto) {
        this.productos.remove(producto);
    }


    // Getters y setters
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double getPORCENTAJE_DE_DESCUENTO() {
        return PORCENTAJE_DE_DESCUENTO;
    }

    public void setPORCENTAJE_DE_DESCUENTO(double PORCENTAJE_DE_DESCUENTO) {
        this.PORCENTAJE_DE_DESCUENTO = PORCENTAJE_DE_DESCUENTO;
    }
}
