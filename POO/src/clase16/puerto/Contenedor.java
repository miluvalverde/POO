package clase16.puerto;

import clase16.equipo.Jugador;

import java.util.Comparator;

public class Contenedor implements Comparable<Contenedor>, Comparator<Contenedor> {

    // Atributos
    private int numero;
    private String paisDeProcedencia;
    private boolean contieneMaterialesPeligrosos;


    // Métodos

    @Override
    public int compareTo(Contenedor contenedor) {
        if (this.getNumero() > contenedor.getNumero()) {
            return 1;
        } else if (this.getNumero() < contenedor.getNumero()) {
            return -1;
        }
        return 0;
    }

    @Override
    public int compare(Contenedor contenedor1, Contenedor contenedor2) {
        return contenedor1.compareTo(contenedor2);
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "numero=" + numero +
                ", paisDeProcedencia='" + paisDeProcedencia + '\'' +
                ", contieneMaterialesPeligrosos=" + contieneMaterialesPeligrosos +
                '}';
    }


    // Getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPaisDeProcedencia() {
        return paisDeProcedencia;
    }

    public void setPaisDeProcedencia(String paisDeProcedencia) {
        this.paisDeProcedencia = paisDeProcedencia;
    }

    public boolean getContieneMaterialesPeligrosos() {
        return contieneMaterialesPeligrosos;
    }

    public void setContieneMaterialesPeligrosos(boolean contieneMaterialesPeligrosos) {
        this.contieneMaterialesPeligrosos = contieneMaterialesPeligrosos;
    }
}
