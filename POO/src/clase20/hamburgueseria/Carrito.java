package clase20.hamburgueseria;

import clase20.hamburgueseria.componentes.Producto;

import java.util.ArrayList;

public class Carrito {

    // Atributos
    private ArrayList<Producto> productos = new ArrayList();


    // Métodos
    public void agregarProductos(Producto producto) {
        this.productos.add(producto);
    }

    public void quitarProducto (Producto producto) {
        this.productos.remove(producto);
    }

    public double calcularTotalDeLaCompra() {
        double acumulador = 0;
        for (Producto producto : this.productos) {
            acumulador += producto.calcularPrecio();
        }
        return acumulador;
    }


    // Getters y setters
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
