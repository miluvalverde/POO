package clase20.almacen;

import clase20.almacen.producto.Producto;

import java.util.ArrayList;

public class Almacen {

    // Atributos
    private ArrayList<Producto> productos;


    // Métodos
    private double calcularEspacioNecesario() {
        double volumenNecesario = 0;
        for (Producto producto: this.productos) {
            volumenNecesario += producto.calcularEspacio();
        }
        return volumenNecesario;
    }


    // Getters y setters
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
