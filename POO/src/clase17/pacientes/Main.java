package clase17.pacientes;

import java.util.*;

public class Main {

    public static void main(String[] args) throws FechaException {

        Paciente paciente = new Paciente("Juan","Perez","12345",new Date(2023,5,4));

        try {
            paciente.darAlta(new Date(2009,5,22));
        } catch (FechaException e) {
            System.out.println(e.getMessage());;
        }
    }
}
