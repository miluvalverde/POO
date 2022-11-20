package clase9.empresaconstructora;

public class Proyecto {

    // Atributos
    private String nombre;
    private int codigo;
    private int cantidadEstimadaHoras;
    private Tarea[] tareas;


    // Constructor
    public Proyecto(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }


    // Setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidadEstimadaHoras() {
        return cantidadEstimadaHoras;
    }

    public void setCantidadEstimadaHoras(int cantidadEstimadaHoras) {
        this.cantidadEstimadaHoras = cantidadEstimadaHoras;
    }

    public Tarea[] getTareas() {
        return tareas;
    }

    public void setTareas(Tarea[] tareas) {
        this.tareas = tareas;
    }
}
