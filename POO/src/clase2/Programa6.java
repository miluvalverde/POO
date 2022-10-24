package clase2;

import java.util.Scanner;

public class Programa6 {


    /*Ingresá tu nombre y tu apellido por separado, a partir de estas variables debés obtener en
    una tercera tus iniciales.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        String iniciales = String.valueOf(nombre.charAt(0)) + String.valueOf(apellido.charAt(0));

        System.out.println("Sus iniciales son: " + iniciales);

    }


}
