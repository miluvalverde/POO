package clase10.arcade;

public class Nave extends Objeto {

    // Atributos
    private double velocidad;
    private int vida;


    // Constructor
    public Nave(int posx, int posy, String direccion, double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
    }


    // Métodos

    @Override
    public void irA(int posx, int posy, String direccion) {
        if (direccion.equals(this.direccion) == true) {
            System.out.println("La nave se mueve en la direccion " + direccion + " hacia la posición " + posx + ", " + posy);
        } else {
            girar(direccion);
            System.out.println("La nave se mueve en la direccion " + direccion + " hacia la posición " + posx + ", " + posy);
        }
    }

    public void girar(String direccion) {
        this.direccion = direccion;
        System.out.println("Girando hacia " + direccion);
    }

    public void restaVida(int valor) {
        this.vida -= valor;
    }


    // Setters y getters
    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
