package clase22.tren;

public class Triangulo implements Forma {

    // Atributos
    private double base;
    private double altura;


    // Constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    // Métodos
    @Override
    public double calcularArea() {
        return this.base * this.altura / 2;
    }


    // Getters y setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
