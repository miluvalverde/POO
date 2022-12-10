package clase20.almacen;

import clase20.almacen.producto.Monio;
import clase20.almacen.producto.PapelDeRegalo;
import clase20.almacen.producto.Pelota;
import clase20.almacen.producto.Producto;

import java.util.ArrayList;

public class RegaloComposite extends Producto {

    // Atributo
    private ArrayList<Producto> productos;


    // Métodos
    @Override
    public double calcularEspacio() {
        double espacio = 0;
        for (Producto producto : productos) {
            espacio += producto.calcularEspacio();
        }
        return espacio;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void quitarProducto(Producto producto) {
        productos.remove(producto);
    }

    public void hacerRegalo() {
        agregarProducto(new Pelota());
        agregarProducto(new Monio());
        agregarProducto(new PapelDeRegalo());
    }

}
