package clase19.DhTech;

import clase19.DhTech.empleados.Empleado;

import java.util.ArrayList;

public class Empresa {

    // Atributos
    private String nombreDeFantasia;
    private ArrayList<Empleado> empleados;


    // Constrcutor
    public Empresa(String nombreDeFantasia) {
        this.nombreDeFantasia = nombreDeFantasia;
    }


    // Métodos
    public double calcularTotalDeSalarios() {
        double total = 0.0;
        for (Empleado empleado : this.empleados) {
            total += empleado.calcularSalario();
        }
        return total;
    }


    // Getters y setters
    public String getNombreDeFantasia() {
        return nombreDeFantasia;
    }

    public void setNombreDeFantasia(String nombreDeFantasia) {
        this.nombreDeFantasia = nombreDeFantasia;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
}
