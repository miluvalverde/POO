package clase2;

import java.util.Scanner;

public class Programa3 {

    /*Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
            Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer
            unNumeroC)
    Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre
    el resultado. */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numeroA = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int numeroB = scanner.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int numeroC = scanner.nextInt();

        System.out.println("El número mayor es: " + maximoEntreTresNumeros(numeroA, numeroB, numeroC));

    }

    static Integer maximoEntreTresNumeros (Integer numeroA, Integer numeroB, Integer numeroC) {
        if (numeroA > numeroB) {
            if (numeroA > numeroC) {
                return numeroA;
            } else {
                return numeroC;
            }
        } else if (numeroB > numeroC) {
            return numeroB;
        } else {
            return numeroC;
        }
    };

}
