package clase19.almacen.producto;

public class Caja extends Producto {

    // Atributos
    private double longitud;
    private double ancho;
    private double altura;


    // Constructor
    public Caja() {
    }

    public Caja(double longitud, double ancho, double altura) {
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }


    // Métodos
    @Override
    public double calcularEspacio() {
        return this.longitud * this.altura * this.ancho;
    }


    // Getters y setters
    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
