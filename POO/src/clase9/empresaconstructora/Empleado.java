package clase9.empresaconstructora;

public class Empleado {

    // Atributos
    protected String nombre;
    protected String apellido;
    protected double cobroFijo;


    // Constructor
    public Empleado(String nombre, String apellido, double cobroFijo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cobroFijo = cobroFijo;
    }


    // Método
    public void realizarTarea(Tarea tarea) {
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

    public double getCobroFijo() {
        return cobroFijo;
    }

    public void setCobroFijo(double cobroFijo) {
        this.cobroFijo = cobroFijo;
    }
}
