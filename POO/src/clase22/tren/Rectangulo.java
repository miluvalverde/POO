package clase22.tren;

public class Rectangulo implements Forma {

    // Atributos
    private double altura;
    private double largo;


    // Constructor
    public Rectangulo(double altura, double largo) {
        this.altura = altura;
        this.largo = largo;
    }


    // Métodos
    @Override
    public double calcularArea() {
        return this.altura * this.largo;
    }


    // Getters y setters
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
}
