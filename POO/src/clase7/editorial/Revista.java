package clase7.editorial;

import clase7.editorial.Editorial;

public class Revista {

    private String nombre;
    private String codigo;
    private String periodicidad;
    private Editorial[] editoriales; // Relación de composición bidireccional con editorial


    // Constructor
    public Revista(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
}
