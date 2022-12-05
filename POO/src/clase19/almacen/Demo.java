package clase19.almacen;

import clase19.almacen.producto.Caja;
import clase19.almacen.producto.Pelota;
import clase19.almacen.producto.Producto;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        // Factory Method
        ProductoFactoryMethod productoFactoryMethod = new ProductoFactoryMethod();


        // Pelotas
        Pelota pelotaFutbol = (Pelota) productoFactoryMethod.crearProducto("PELOTAFUTBOL");
        Pelota pelotaTenis = (Pelota) productoFactoryMethod.crearProducto("PELOTATENIS");


        // Cajas
        Caja caja1 = (Caja) productoFactoryMethod.crearProducto("CAJA10X10");
        Caja caja2 = (Caja) productoFactoryMethod.crearProducto("CAJA10X10");


        // Almacen
        Almacen almacenDH = new Almacen();
        almacenDH.setProductos(new ArrayList<Producto>(Arrays.asList(pelotaTenis, pelotaFutbol, caja1, caja2)));

    }



}
