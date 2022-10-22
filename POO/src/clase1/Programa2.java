package clase1;

public class Programa2 {

    public static void main(String[] args) {

//        Para representar cada una de las características de las mascotas, crear una variable y darle
//        el valor correspondiente en el IDE IntelliJ. No olvidar darle el tipo adecuado a lo que
//        queremos que contenga. Por cada mascota de la veterinaria que figura en la siguiente
//        tabla, vamos a tener que mostrar la información del animal. La información va a mostrarse
//        como el siguiente ejemplo:
//        “Manchitas tiene 2 años”
//        “Manchitas come un kilo y medio y hace guau guau”

        String nombrePerro = "Manchitas";
        String edadPerro = "2 años";
        String cuantoComePerro = "1 kilo y medio";
        String respondemosPerro = "guau guau";

        System.out.println(nombrePerro + " tiene " + edadPerro);
        System.out.println(nombrePerro + " come " + cuantoComePerro + " y hace " + respondemosPerro);

        // Otra forma de hacerlo es generando una única función que imprima los datos para cada caso
        respuesta(nombrePerro, edadPerro, cuantoComePerro, " y hace ", respondemosPerro);

        // La función también puede ser de tipo devuelto String
        // Acordarse que en la función string se debe colocar un return si o si
        respuestaString(nombrePerro, edadPerro, cuantoComePerro, " y hace ", respondemosPerro);
    }

    // Función void
    public static void respuesta(String nombre, String edad, String cuantoCome, String frase, String respondemos) {
        System.out.println(nombre + " tiene " + edad);
        System.out.println(nombre + " come " + cuantoCome + frase + respondemos + "\n"); // salto de línea
    };

    // Función String
    public static String respuestaString(String nombre, String edad, String cuantoCome, String frase, String respondemos) {
        return nombre + " tiene " + edad + "\n" + nombre + " come " + cuantoCome + frase + respondemos;
    };


}
