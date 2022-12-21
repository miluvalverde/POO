package clase22.tren;

import java.util.ArrayList;

public class CompuestoComposite implements Forma{

    // Atributos
    private ArrayList<Forma> formas;


    // Métodos
    public void agregarFigura (Forma forma) {
        this.formas.add(forma);
    }

    public void quitarFigura (Forma forma) {
        this.formas.remove(forma);
    }

    public void hacerVagon(double radio, double altura, double largo) {
        agregarFigura(new Rectangulo(altura, largo));
        agregarFigura(new Circulo(radio));
        agregarFigura(new Circulo(radio));
        agregarFigura(new Circulo(radio));
    }

    public void hacerLocomotora(double alturaR, double largo, double radio, double base, double alturaT) {
        agregarFigura(new Rectangulo(alturaR, largo));
        agregarFigura(new Circulo(radio));
        agregarFigura(new Circulo(radio));
        agregarFigura(new Triangulo(alturaT, base));
    }

    @Override
    public double calcularArea() {
        double area = 0;
        for (Forma forma: formas) {
            area += forma.calcularArea();
        }
        return area;
    }
}
