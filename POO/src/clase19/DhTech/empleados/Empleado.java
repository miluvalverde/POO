package clase19.DhTech.empleados;

public interface Empleado {

    // Método
    public default double calcularSalario() {
        return 0;
    }

}
