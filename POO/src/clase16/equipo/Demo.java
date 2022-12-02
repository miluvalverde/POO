package clase16.equipo;

import java.util.Collections;

public class Demo {

    public static void main(String[] args) {

        Jugador jugador1 = new Jugador();
        jugador1.setNombre("Milagros");
        jugador1.setNumeroDeCamiseta(1);
        jugador1.setEsTitular(true);
        jugador1.setEstaLesionado(false);

        Jugador jugador2 = new Jugador();
        jugador2.setNumeroDeCamiseta(2);
        jugador2.setNombre("Mario");
        jugador2.setEsTitular(true);
        jugador2.setEstaLesionado(false);

        Equipo equipo = new Equipo();
        equipo.setNombre("Super equipo");
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador1);

        // Jugadores titulares ordenados de menor a mayor
        Collections.sort(equipo.getJugadores());
        equipo.mostrarJugadoresTitulares();



        System.out.println(equipo.obtenerCantidadDeJugadoresLesionados());

    }

}
