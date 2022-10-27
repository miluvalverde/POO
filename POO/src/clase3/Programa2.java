package clase3;

import java.util.Scanner;

public class Programa2 {

    /*Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
    aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
    en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
    una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
    devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
    cuando el primero elije “*” como indicador de final.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del participante 1: ");
        String nombreParticipanteUno = scanner.nextLine();

        System.out.println("Ingrese el nombre del participante 2: ");
        String nombreParticipanteDos = scanner.nextLine();

        int puntajeUno = 0;
        int puntajeDos = 0;

        String jugadaUno = "";
        String parar = "*";

        System.out.println("REGLAS DEL JUEGO:");
        System.out.println("1 = Piedra");
        System.out.println("2 = Papel");
        System.out.println("3 = Tijera");
        System.out.println("* = Parar");
        System.out.println("\n");

        // Loop para poder jugar
        while (jugadaUno.compareTo(parar) != 0) {
            System.out.println(nombreParticipanteUno + " ingresa tu jugada: ");
            jugadaUno = scanner.nextLine();

            if (jugadaUno.compareTo(parar) != 0) {
                System.out.println(nombreParticipanteDos + " ingresa tu jugada: ");
                String jugadaDos = scanner.nextLine();
                if (cualGana(jugadaUno, jugadaDos) == 1) {
                    puntajeUno++;
                } else if (cualGana(jugadaUno, jugadaDos) == 2) {
                    puntajeDos++;
                }
            }

        }
        determinarPuntos(nombreParticipanteUno, nombreParticipanteDos, puntajeUno, puntajeDos);
    }

    // Función que determina un puntaje según la respuesta de los jugadores
    static int cualGana (String parametroUno, String parametroDos) {
        int puntaje = 0;
        if (parametroUno.equals(parametroDos)) {
            puntaje = 0;
        } else if (parametroUno.equals("1") && parametroDos.equals("2")) {
            puntaje = 2;
        } else if (parametroUno.equals("1") && parametroDos.equals("3")) {
            puntaje = 1;
        } else if (parametroUno.equals("2") && parametroDos.equals("3")) {
            puntaje = 2;
        } else if (parametroUno.equals("2") && parametroDos.equals("1")) {
            puntaje = 1;
        } else if (parametroUno.equals("3") && parametroDos.equals("1")) {
            puntaje = 2;
        } else if (parametroUno.equals("3") && parametroDos.equals("2")) {
            puntaje = 1;
        }
        return puntaje;
    }

    // Función que determina quién es el ganador en función de los puntos obtenidos
    static void determinarPuntos (String nombreParticipanteUno, String nombreParticipanteDos, int puntajeUno, int puntajeDos) {
            System.out.println("El juego se ha parado");
            if (puntajeUno > puntajeDos) {
                System.out.println("El ganador es " + nombreParticipanteUno);
            } else if (puntajeUno < puntajeDos) {
                System.out.println("El ganador es " + nombreParticipanteDos);
            } else {
                System.out.println("Es un empate");
            }
    }

}
