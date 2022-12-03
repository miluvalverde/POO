package clase17.exception_en_clase;

import java.util.*;

public class DemoException {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // División
//        int resultado = numeroA / numeroB;
//        System.out.println("Resultado = " + resultado);

        int resultado = 0;

        try {
            System.out.println("Ingrese un número: ");
            int numeroA = scanner.nextInt();

            System.out.println("Ingrese otro número: ");
            int numeroB = scanner.nextInt();

            if (numeroB > numeroA) {
                throw new Exception("No podes dividir por un número mayor");
            }

            System.out.println("\n Has ingresado un " + numeroA + " y " + numeroB);

            resultado = numeroA / numeroB;
            System.out.println("Resultado = " + resultado);

        } catch (ArithmeticException e) { // El tipo de excepción se puede ver cuando coloco los datos que quiero en la ejecución
            System.out.println("Operación incorrecta. No se puede dividir por cero");
        } catch (InputMismatchException e) {
            System.out.println("Operación incorrecta. Debes ingresar números enteros");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Resultado = " + resultado);
        }

        System.out.println("Continua la ejecución ...");



    }


}
