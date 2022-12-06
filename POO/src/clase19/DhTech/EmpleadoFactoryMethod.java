package clase19.DhTech;

import clase19.DhTech.empleados.Empleado;
import clase19.DhTech.empleados.EmpleadoContratadoPorHora;
import clase19.DhTech.empleados.EmpleadoRelacionDeDependencia;

public class EmpleadoFactoryMethod {

    public Empleado crearEmpleado(String tipo) {
        switch (tipo) {
            case "EMP-RD":
                return new EmpleadoRelacionDeDependencia();
            case "EMP-PH":
                return new EmpleadoContratadoPorHora();
        }
        return null;
    }

}
