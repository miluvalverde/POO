package clase8.clinica;

public class Paciente {

    // Atributos
    private String numeroDocumento;
    private String nombre;
    private int edad;
    private String nombreObraSocial;
    private boolean particular;
    private int cantidadEstudios;
    private boolean tieneCirujia;
    private boolean tieneAltaMedica;
    private Medico[] medicos;


    // Constructor
    public Paciente(String numeroDocumento, String nombre, int edad) {
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Setters y getters
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreObraSocial() {
        return nombreObraSocial;
    }

    public void setNombreObraSocial(String nombreObraSocial) {
        this.nombreObraSocial = nombreObraSocial;
    }

    public boolean isParticular() {
        return particular;
    }

    public void setParticular(boolean particular) {
        this.particular = particular;
    }

    public int getCantidadEstudios() {
        return cantidadEstudios;
    }

    public void setCantidadEstudios(int cantidadEstudios) {
        this.cantidadEstudios = cantidadEstudios;
    }

    public boolean isTieneCirujia() {
        return tieneCirujia;
    }

    public void setTieneCirujia(boolean tieneCirujia) {
        this.tieneCirujia = tieneCirujia;
    }

    public boolean isTieneAltaMedica() {
        return tieneAltaMedica;
    }

    public void setTieneAltaMedica(boolean tieneAltaMedica) {
        this.tieneAltaMedica = tieneAltaMedica;
    }

    public Medico[] getMedicos() {
        return medicos;
    }

    public void setMedicos(Medico[] medicos) {
        this.medicos = medicos;
    }
}
