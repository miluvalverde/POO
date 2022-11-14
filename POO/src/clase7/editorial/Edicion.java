package clase7.editorial;

import java.util.Date;

public class Edicion {

    private String numero;
    private Date fecha;
    private double precio;
    private Articulo[] articulos; // Relación de composición bidireccional con articulo


    // Constructor
    public Edicion(String numero, Date fecha) {
        this.numero = numero;
        this.fecha = fecha;
    }

}
