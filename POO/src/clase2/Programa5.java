package clase2;

public class Programa5 {
    /*Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un
    mensaje.

    Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
    Informar el resultado obtenido.*/

    public static void main(String[] args) {

        String primeraCadena = "Hola, me llamo Milagros";
        String segundaCadena = "Hola, me llamo Natalia";

        System.out.println(compararCadenas(primeraCadena, segundaCadena));

        int primerNumero = 12000;
        int segundoNumero = 1300;

        System.out.println(compararNumeros(primerNumero, segundoNumero));
    }

    static String compararCadenas (String primeraCadena, String segundaCadena) {
        if (primeraCadena.compareTo(segundaCadena) == 0) {
            return "Ambas cadenas son iguales";
        } else {
            return "Las cadenas son distintas";
        }
    };

    static String compararNumeros (int primerNumero, int segundoNumero) {
        if (primerNumero == segundoNumero) {
            return "Ambos números son iguales";
        } else if (primerNumero > segundoNumero) {
            return primerNumero + " es mayor que " + segundoNumero;
        } else {
            return segundoNumero + " es mayor que " + primerNumero;
        }
    }

}

