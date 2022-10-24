
package clase2;

public class Programa7 {

    /*Hacer una función que reciba como parámetro dos valores y devuelva un boolean. La
    función debe comprobar si el primer número es divisible por el segundo.
    boolean esDivisible(int n, int divisor)
    NOTA: Que sea divisible quiere decir que al dividir da un valor exacto, es decir, sin
    decimales.*/

    public static void main(String[] args) {

        System.out.println(esDivisible(120, 13));

    }

    static boolean esDivisible (int n, int divisor) {
        if (n % divisor == 0) {
            return true;
        } else {
            return false;
        }
    }

}
