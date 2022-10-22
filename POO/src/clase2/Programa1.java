package clase2;

import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese el día de su fecha de nacimiento: ");
        int dia = scanner.nextInt();

        System.out.println("Ingrese el mes de su fecha de nacimiento: ");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el año de su fecha de nacimiento: ");
        int anio = scanner.nextInt();

        Character inicialNombre = nombre.charAt(0); // el dato char es solo 1 caracter
        Character inicialApellido = apellido.charAt(0);
        String inicialesUno = inicialNombre.toString() + inicialApellido.toString();
         /*es necesario poner Character en vez de char para generar una clase a las iniciales,
         y así pasarle el método toString()*/

        // Otra forma: convierte el valor de nombre.charAt (devuelve un char) a un string
        String inicialesDos = String.valueOf(nombre.charAt(0)) + String.valueOf(apellido.charAt(0));

        System.out.println("\n ------ Ficha Personal ------ ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Iniciales: " + inicialesUno);
        System.out.println("Fecha de nacimiento: " + armarFechaNacimiento(dia, mes, anio));
    }

    static String armarFechaNacimiento (int dia, int mes, int anio) {
        return dia + "/" + mes + "/" + anio;
    }

}

