package clase16.equipo;

import java.util.ArrayList;

public class Equipo {

    // Atributos
    private String nombre;
    private ArrayList<Jugador> jugadores = new ArrayList<>(); // en vez de hacer private Jugador[] jugadores


    // Métodos
    public void agregarJugador (Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public void mostrarJugadoresTitulares() {
        for (Jugador jugador: jugadores) {
            if (jugador.getEsTitular()) {
                System.out.println(jugador.toString());
            }
        }
    }

    public int obtenerCantidadDeJugadoresLesionados () {
        int contador = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getEstaLesionado()) {
                contador ++;
            }
        }
        return contador;
    }


    // Setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
