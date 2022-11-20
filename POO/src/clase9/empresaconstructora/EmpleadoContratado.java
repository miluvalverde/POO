package clase9.empresaconstructora;

public class EmpleadoContratado extends Empleado {

    // Atributos
    private double importePorHora;
    private int cantidadHoras;


    // Constructor
    public EmpleadoContratado(String nombre, String apellido, double cobroFijo, double importePorHora) {
        super(nombre, apellido, cobroFijo);
        this.importePorHora = importePorHora;
    }


    // Setters y getters
    public double getImportePorHora() {
        return importePorHora;
    }

    public void setImportePorHora(double importePorHora) {
        this.importePorHora = importePorHora;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }
}
