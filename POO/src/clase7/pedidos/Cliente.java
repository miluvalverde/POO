package clase7.pedidos;

public class Cliente {

    // Atributos
    private String nombre;
    private int telefono;
    private String domicilio;
    private Pedido[] pedidos;


    // Constructor
    public Cliente(String nombre, Pedido[] pedidos) {
        this.nombre = nombre;
        this.pedidos = pedidos;
    }

}
