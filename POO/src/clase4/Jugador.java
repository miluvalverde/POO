package clase4;

public class Jugador {

    // Atributos o propiedades públicas
    public String nombre;
    public String apellido;
    public String posicion;
    public int numero;

    // Constructor por defecto
    public Jugador (String nombre, String apellido, String posicion, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
    }

    // Métodos públicos
    public void patear () {
        // Lógica
    }

    public void correr () {
        // Lógica
    }

    public void colocarNombre (String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Pablo", "Medina", "Arquero", 1);
        Jugador jugador2 = new Jugador("Mario", "Medina", "Defensa", 32);
//      Jugador jugador7 = new Jugador();
        jugador1.patear();


    }

}
