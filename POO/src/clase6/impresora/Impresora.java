package clase6.impresora;


import java.util.Date;

public class Impresora {
    /*Las impresoras tienen un modelo, un tipo de conexión, ya que muchas son USB y otras inalámbircas
    Poseen una fecha de fabricación y todas ellas saben la cantidad de hojas disponibles que tienen*/

    // Atributos o propiedades
    private String modelo;
    private String tipoDeConexion;
    private Date fechaDeFabricacion;
    private int cantidadDeHojas;


    // Constructores
    public Impresora (String modelo, String tipoDeConexion) {
        this.modelo = modelo;
        this.tipoDeConexion = tipoDeConexion;
    }

    public Impresora (String modelo, String tipoDeConexion, Date fecha) {
        this.modelo = modelo;
        this.tipoDeConexion = tipoDeConexion;
        this.fechaDeFabricacion = fecha;
    }


    // Métodos públicos
    public void imprimir (String documento, int hojas) {
        if (hojas <= cantidadDeHojas) {
            this.cantidadDeHojas -= hojas;
            System.out.println("Imprimiendo... ");
        } else {
            System.out.println("Falta papel");
        }
    }


    // Setters
    public void setCantidadDeHojas (int hojas) {
        this.cantidadDeHojas = hojas;
    }

    public void setFechaDeFabricacion (Date fecha) {
        this.fechaDeFabricacion = fecha;
    }


    // Getters
    public String getModelo () {
        return this.modelo;
    }

    public String getTipoDeConexion () {
        return this.tipoDeConexion;
    }

    public Date getFechaDeFabricacion () {
        return this.fechaDeFabricacion;
    }

    public int getCantidadDeHojas () {
        return this.cantidadDeHojas;
    }


}