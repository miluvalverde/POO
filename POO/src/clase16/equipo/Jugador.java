package clase16.equipo;

import java.util.Comparator;

public class Jugador implements Comparable<Jugador>, Comparator<Jugador> {

    // Atributos
    private int numeroDeCamiseta;
    private String nombre;
    private boolean estaLesionado;
    private boolean esTitular;


    // Métodos
    @Override
    public int compareTo(Jugador jugador) {
        if (this.getNumeroDeCamiseta() > jugador.getNumeroDeCamiseta()) {
            return 1;
        } else if (this.getNumeroDeCamiseta() < jugador.getNumeroDeCamiseta()) {
            return -1;
        }
        return 0;
    }

    @Override
    public int compare(Jugador jugador1, Jugador jugador2) {
        return jugador1.compareTo(jugador2);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "numeroDeCamiseta=" + numeroDeCamiseta +
                ", nombre='" + nombre +
                ", estaLesionado=" + estaLesionado +
                ", esTitular=" + esTitular +
                '}';
    }


    // Setters y getters
    public int getNumeroDeCamiseta() {
        return numeroDeCamiseta;
    }

    public void setNumeroDeCamiseta(int numeroDeCamiseta) {
        this.numeroDeCamiseta = numeroDeCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEstaLesionado() {
        return estaLesionado;
    }

    public void setEstaLesionado(boolean estaLesionado) {
        this.estaLesionado = estaLesionado;
    }

    public boolean getEsTitular() {
        return esTitular;
    }

    public void setEsTitular(boolean esTitular) {
        this.esTitular = esTitular;
    }

}
