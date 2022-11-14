package clase7.pedidos;

import java.util.Date;

public class Pedido {

    /*Se desea modelar como es el registro de pedidos en un negocio de venta online.
    Los clientes a los cuales se les pide nombre, teléfono, domicilio, realizan los pedidos
    mediante una página web del comercio. La información que queda guardada del pedido es
    fecha del pedido, cliente que lo efectuó, además cada pedido tiene un código. Cada pedido
    a su vez está compuesto por varios ítems, (los artículos adquiridos). Para el comercio un
    artículo tiene un nombre y un precio*/


    // Atributos
    private Date fecha;
    private int codigo;
    private Cliente cliente;
    private Articulo[] articulos;


    // Constructor
    public Pedido(int codigo) {
        this.codigo = codigo;
    }

}
