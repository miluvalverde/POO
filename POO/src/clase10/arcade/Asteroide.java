package clase10.arcade;

public class Asteroide extends Objeto {

    // Atributos
    private int lesion;


    // Constructor
    public Asteroide(int posx, int posy, String direccion, int lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }


    // Métodos
    @Override
    public void irA(int posx, int posy, String direccion) {
        System.out.println("El asterodie se mueve en la direccion " + direccion + " hacia la posición " + posx + ", " + posy);;
    }


    // Setters y getters
    public int getLesion() {
        return lesion;
    }

    public void setLesion(int lesion) {
        this.lesion = lesion;
    }
}
