package clase20.almacen.producto;

public abstract class Producto {

    // Atributos
    private double peso;


    // Métodos
    public abstract double calcularEspacio();


    // Getters y setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
