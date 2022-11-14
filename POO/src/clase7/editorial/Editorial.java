package clase7.editorial;

public class Editorial {

    /*Una editorial produce una serie de revistas periodísticas. Cada revista tiene un nombre, un
    código, periodicidad (semanal o mensual). Las revistas tienen muchas ediciones en las
    ediciones tenemos: número de edición, fecha de edición y precio. En cada edición aparecen
    una serie de artículos, cada uno con su título, tema, autor, fecha del artículo.*/

    // Atributos
    private String nombre;
    private int anioCreacion;
    private String direccion;
    private int telefono;
    private Revista[] revistas; // Relación de composición bidireccional con revista

    // Constructor
    public Editorial(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}
