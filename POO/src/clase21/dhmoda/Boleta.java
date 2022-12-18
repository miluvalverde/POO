package clase21.dhmoda;

import java.util.ArrayList;
import java.util.Date;

public class Boleta {

    // Atributos
    private ArrayList<Producto> productos = new ArrayList();
    private Date fecha;
    private boolean estaPaga = false;


    // Métodos
    public void mostrarProductos() {
        System.out.println("Los productos en la boleta son: ");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " " + producto.getColor());
        }
    }

    public double calcularPrecio() {
        double precioTotal = 0;
        System.out.println("El precio total de la boleta es de: ");
        for (Producto producto : productos) {
            precioTotal += producto.calcularPrecio();
        }
        return precioTotal;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void quitarProducto(Producto producto) {
        productos.add(producto);
    }

    public void finalizarBoleta() {
        if (!(productos.isEmpty())) {
            this.fecha = new Date();
            this.estaPaga = true;
            System.out.println("Boleta pagada");
        }
    }


}
