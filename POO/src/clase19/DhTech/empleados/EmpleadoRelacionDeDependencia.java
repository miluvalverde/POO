package clase19.DhTech.empleados;

public class EmpleadoRelacionDeDependencia implements Empleado {

    // Atributos
    private double salarioBruto;
    private static double incentivo = 15.0;


    // Constructor
    public EmpleadoRelacionDeDependencia() {}
    public EmpleadoRelacionDeDependencia(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }


    // Métodos
    @Override
    public double calcularSalario() {
        return  this.salarioBruto + EmpleadoRelacionDeDependencia.incentivo; // Si es static debe ser de esta forma
    }

    // Getters y setters
    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
}
