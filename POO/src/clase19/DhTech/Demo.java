package clase19.DhTech;

import clase19.DhTech.empleados.Empleado;
import clase19.DhTech.empleados.EmpleadoContratadoPorHora;
import clase19.DhTech.empleados.EmpleadoRelacionDeDependencia;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        // Crear empresa
        Empresa dhEmpresa = new Empresa("DHTech");

        // Crear factoryMethod
        EmpleadoFactoryMethod empleadoFactoryMethod = new EmpleadoFactoryMethod();

        // Crear empleados
        EmpleadoRelacionDeDependencia empleadoRD1 = (EmpleadoRelacionDeDependencia) empleadoFactoryMethod.crearEmpleado("EMP-RD");
        empleadoRD1.setSalarioBruto(1000);
        System.out.println(empleadoRD1.calcularSalario());

        EmpleadoContratadoPorHora empleadoPH1 = (EmpleadoContratadoPorHora) empleadoFactoryMethod.crearEmpleado("EMP-PH");
        empleadoPH1.setCantidadDeHoras(100);
        empleadoPH1.setImportePorHora(14);
        empleadoPH1.calcularSalario();


        dhEmpresa.setEmpleados(new ArrayList<Empleado>(Arrays.asList(empleadoPH1, empleadoRD1)));

    }



}
