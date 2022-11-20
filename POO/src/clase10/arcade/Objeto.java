package clase10.arcade;

public class Objeto {

    // Atributos
    protected int posx;
    protected int posy;
    protected String direccion;


    // Constructor
    public Objeto(int posx, int posy, String direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }


    // Método
    public void irA (int posx, int posy, String direccion) {
        System.out.println("Moviéndose en la direccion " + direccion + " hacia la posición " + posx + ", " + posy);
    }


    // Setters y getters
    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
