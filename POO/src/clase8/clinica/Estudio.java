package clase8.clinica;

public class Estudio {

    // Atributos
    private double costoEstudio;
    private String nombre;


    // Constructor
    public Estudio(double costoEstudio, String nombre) {
        this.costoEstudio = costoEstudio;
        this.nombre = nombre;
    }


    // Setters y getters
    public double getCostoEstudio() {
        return costoEstudio;
    }

    public void setCostoEstudio(double costoEstudio) {
        this.costoEstudio = costoEstudio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
