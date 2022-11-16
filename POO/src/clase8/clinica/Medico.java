package clase8.clinica;

public class Medico {

    // Atributos
    protected int numeroMatricula;
    protected String nombre;
    protected double importeHonorario;
    protected Paciente[] pacientes;


    // Constructor
    public Medico(int numeroMatricula, String nombre, double importeHonorario) {
        this.numeroMatricula = numeroMatricula;
        this.nombre = nombre;
        this.importeHonorario = importeHonorario;
    }


    // Setters y getters
    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getImporteHonorario() {
        return importeHonorario;
    }

    public void setImporteHonorario(double importeHonorario) {
        this.importeHonorario = importeHonorario;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }

}
