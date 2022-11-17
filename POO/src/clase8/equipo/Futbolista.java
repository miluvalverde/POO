package clase8.equipo;

public class Futbolista extends Persona {

    // Atributos
    private String posicion;
    private String estatus;


    // Constructor
    public Futbolista(String nombre, String apellido, String posicion, String estatus) {
        super(nombre, apellido);
        this.posicion = posicion;
        this.estatus = estatus;
    }


    // Setters y getters
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
