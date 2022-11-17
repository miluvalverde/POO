package clase8.colegio;

public class Profesor extends Persona {

    // Atributos
    private String titulo;
    private int aniosAntiguedadLaboral;


    // Constructor
    public Profesor(String nombre, String apellido, String titulo) {
        super(nombre, apellido);
        this.titulo = titulo;
    }


    // Métodos
    public void darClase() {
        //Lógica
    }


    // Setters y getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAniosAntiguedadLaboral() {
        return aniosAntiguedadLaboral;
    }

    public void setAniosAntiguedadLaboral(int aniosAntiguedadLaboral) {
        this.aniosAntiguedadLaboral = aniosAntiguedadLaboral;
    }
}
