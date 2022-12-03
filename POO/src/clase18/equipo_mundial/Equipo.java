package clase18.equipo_mundial;

import java.util.ArrayList;

public class Equipo {

    // Atributos
    private String nombre;
    private ArrayList<Jugador> plantel;


    // Constructor
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.plantel = new ArrayList<>();
    }


    // Métodos
    public ArrayList<Jugador> obtenerJugadoresDeReserva() {
        ArrayList<Jugador> jugadoresDeReserva = new ArrayList();

        for (Jugador jugador : this.plantel) {
            if (jugador.getNumeroDeCamiseta() >= 19) {
                jugadoresDeReserva.add(jugador);
            }
        }

        return jugadoresDeReserva;
    }

    public int obtenerCantidadDeJugadores(String posicion) throws PosicionInexistenteException {
        int cantidadDeJugadores = 0;

        if (posicion != "ARQUERO" || posicion != "DEFENSOR" || posicion != "MEDIOCAMPISTA" || posicion != "DELANTERO") {
            throw new PosicionInexistenteException();
        }

        for (Jugador jugador : this.plantel) {
            if (jugador.getPosicion().equals(posicion) == true) {
                cantidadDeJugadores += 1;
            }
        }

        return cantidadDeJugadores;
    }


    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getPlantel() {
        return plantel;
    }

    public void setPlantel(ArrayList<Jugador> plantel) {
        this.plantel = plantel;
    }
}
