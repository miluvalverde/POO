package clase20.almacen;

import clase20.almacen.producto.Caja;
import clase20.almacen.producto.Pelota;
import clase20.almacen.producto.Producto;

public class ProductoFactoryMethodSingleton {

    // Atributos
    private static ProductoFactoryMethodSingleton instancia;


    // Constructor
    private  ProductoFactoryMethodSingleton() {
    }


    // Métodos
    public Producto crearProducto(String tipo) {
        switch (tipo) {
            case "CAJA10X10":
                return new Caja(10.0, 10.0, 10.0);
            case "PELOTAFUTBOL":
                return new Pelota(11.0);
            case "PELOTATENIS":
                return new Pelota(0.32);
        }
        return null;
    }

    public static ProductoFactoryMethodSingleton obtenerInstancia(){
        if (ProductoFactoryMethodSingleton.instancia == null) {
            ProductoFactoryMethodSingleton.instancia = new ProductoFactoryMethodSingleton();
        }

        return ProductoFactoryMethodSingleton.instancia;
    }


    // Getters y setters
    public ProductoFactoryMethodSingleton getInstancia() {
        return instancia;
    }

    public void setInstancia(ProductoFactoryMethodSingleton instancia) {
        this.instancia = instancia;
    }
}
