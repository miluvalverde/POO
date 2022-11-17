package clase8.equipo;

public class Persona {

    // Atributos
    protected String nombre;
    protected String apellido;
    protected int edad;


    // Constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }


    // Métodos
    public void concurrir() {
        // Lógica
    }

    public void perfeccionarHabilidades() {
        // Lógica
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
