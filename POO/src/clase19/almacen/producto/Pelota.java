package clase19.almacen.producto;

public class Pelota extends Producto {

    // Atributos
    private double radio;


    // Constructor
    public Pelota() {
    }

    public Pelota(double radio) {
        this.radio = radio;
    }

    // Métodos
    @Override
    public double calcularEspacio() {
        return (4 / 3) * Math.PI * Math.pow(this.radio, 3);
    }


    // Getters y setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
