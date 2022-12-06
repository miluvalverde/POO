package clase19.DhTech.empleados;

public class EmpleadoContratadoPorHora implements Empleado {

    // Atributos
    private double importePorHora;
    private double cantidadDeHoras;


    // Constructor
    public EmpleadoContratadoPorHora() {}
    public EmpleadoContratadoPorHora(double importePorHora, double cantidadDeHoras) {
        this.importePorHora = importePorHora;
        this.cantidadDeHoras = cantidadDeHoras;
    }

    // Métodos
    @Override
    public double calcularSalario() {
        return this.importePorHora * this.cantidadDeHoras;
    }


    // Getters y setters
    public double getImportePorHora() {
        return importePorHora;
    }

    public void setImportePorHora(double importePorHora) {
        this.importePorHora = importePorHora;
    }

    public double getCantidadDeHoras() {
        return cantidadDeHoras;
    }

    public void setCantidadDeHoras(double cantidadDeHoras) {
        this.cantidadDeHoras = cantidadDeHoras;
    }
}
