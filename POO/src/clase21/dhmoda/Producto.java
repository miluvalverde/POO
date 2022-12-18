package clase21.dhmoda;

public abstract class Producto {

    // Atributos
    private String nombre;
    private String color;
    private double precio;
    private static int margenDeGanancia;


    // Métodos
    public abstract double calcularPrecio();


    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getMargenDeGanancia() {
        return margenDeGanancia;
    }

    public static void setMargenDeGanancia(int margenDeGanancia) {
        Producto.margenDeGanancia = margenDeGanancia;
    }
}
