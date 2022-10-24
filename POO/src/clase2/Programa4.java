package clase2;

public class Programa4 {

    /* Escribir una función:
    boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
    que debe tomar dos cadenas de texto y devolver true, en caso de que sean distintos, o
    false, en caso de que coincidan. */

    public static void main(String[] args) {
        System.out.println(cadenasDeTextoDistintas("hola", "hola1"));
    }

    static boolean cadenasDeTextoDistintas (String unTextoA, String unTextoB) {
        if (unTextoA.compareTo(unTextoB) == 0) {
            return false;
        } else {
            return true;
        }
    }

}
