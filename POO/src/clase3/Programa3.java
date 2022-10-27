package clase3;

public class Programa3 {

    /*Modificá la función cualGana del Desafío 1 para jugar la variante Spock: Hay una
    posibilidad más, el señor Spock —formado por la mano Vulcana de Star Trek— tiene otros
    poderes según:
    Papel desaprueba Spock
    Spock destroza tijeras
    Spock vaporiza piedra*/

    public static void main(String[] args) {
        System.out.println("REGLAS DEL JUEGO:");
        System.out.println("1 = Piedra");
        System.out.println("2 = Papel");
        System.out.println("3 = Tijera");
        System.out.println("4 = Spock");
        System.out.println("* = Parar");
        System.out.println("\n");
    }

    static int cualGana (String parametroUno, String parametroDos) {
        int puntaje = 0;
        if (parametroUno.equals(parametroDos)) {
            puntaje = 0;
        } else if (parametroUno.equals("1") && parametroDos.equals("2")) {
            puntaje = 2;
        } else if (parametroUno.equals("1") && parametroDos.equals("3")) {
            puntaje = 1;
        } else if (parametroUno.equals("1") && parametroDos.equals("4")) {
            puntaje = 2;
        } else if (parametroUno.equals("2") && parametroDos.equals("3")) {
            puntaje = 2;
        } else if (parametroUno.equals("2") && parametroDos.equals("4")) {
            puntaje = 1;
        }else if (parametroUno.equals("2") && parametroDos.equals("1")) {
            puntaje = 1;
        } else if (parametroUno.equals("3") && parametroDos.equals("1")) {
            puntaje = 2;
        } else if (parametroUno.equals("3") && parametroDos.equals("2")) {
            puntaje = 1;
        } else if (parametroUno.equals("3") && parametroDos.equals("4")) {
            puntaje = 1;
        }
        return puntaje;
    }
}
