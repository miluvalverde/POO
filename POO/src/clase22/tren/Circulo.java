package clase22.tren;

public class Circulo implements Forma {

    // Atributos
    private double radio;


    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Métodos
    @Override
    public double calcularArea() {
        return this.radio * this.radio * Math.PI;
    }


    // Getters y setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
