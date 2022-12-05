package clase19.almacen;

import clase19.almacen.producto.Caja;
import clase19.almacen.producto.Pelota;
import clase19.almacen.producto.Producto;

public class ProductoFactoryMethod {

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

}
