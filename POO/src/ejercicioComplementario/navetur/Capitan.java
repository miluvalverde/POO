package ejercicioComplementario.navetur;

public class Capitan {

    // Atributos
    private String nombre;
    private String apellido;
    private String matriculaDeNavegacion;


    // Constructor
    public Capitan(String nombre, String apellido, String matriculaDeNavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaDeNavegacion = matriculaDeNavegacion;
    }


    // Setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMatriculaDeNavegacion() {
        return matriculaDeNavegacion;
    }

    public void setMatriculaDeNavegacion(String matriculaDeNavegacion) {
        this.matriculaDeNavegacion = matriculaDeNavegacion;
    }
}
