package clase7.pedidos;

import java.util.Date;

public class Pedido {

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
