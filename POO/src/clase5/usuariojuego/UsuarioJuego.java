package clase5.usuariojuego;

public class UsuarioJuego {
    /*Para desarrollar un juego necesitamos implementar la clase UsuarioJuego. Los usuarios
    tienen nombre y clave, estos datos se deben suministrar cuando se crea un nuevo usuario.
    Inicialmente tienen puntaje y nivel en cero. Sin embargo, pueden aumentar tanto el puntaje
    como el nivel en 1, debemos suministrar un método para poder hacerlo. El usuario también
    puede recibir un bonus, esto quiere decir que recibe un valor extra que se suma a su puntaje.*/


    // Atributos o propiedades
    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;


    // Getters
    public double getPuntaje () {
        return this.puntaje;
    }

    public double getNivel () {
        return this.nivel;
    }


    // Constructor
    public UsuarioJuego (String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0.0;
        this.nivel = 0;
    }


    // Métodos públicos
    public void aumentarPuntaje () {
        puntaje++;
    }

    public void subirNivel () {
        nivel++;
    }

    public void bonus (int valor) {
        puntaje += valor;
    }

}
