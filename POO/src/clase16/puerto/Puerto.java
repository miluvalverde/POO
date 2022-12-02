package clase16.puerto;

import clase16.equipo.Jugador;

import java.util.ArrayList;

public class Puerto {

    // Atributos
    private String nombre;
    private ArrayList<Contenedor> contenedores = new ArrayList<>();


    // Métodos
    public void ingresarContenedor(Contenedor contenedor) {
        this.contenedores.add(contenedor);
    }

    public int cantidadDeContenedoresDesconocidos() {
        int contador = 0;
        for (Contenedor contenedor: contenedores) {
            if (contenedor.getPaisDeProcedencia().equals("Desconocido")) {
                System.out.println(contenedor.toString());
            }
        }
        return contador;
    }


}
