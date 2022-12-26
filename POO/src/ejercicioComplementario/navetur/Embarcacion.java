package ejercicioComplementario.navetur;

public class Embarcacion {

    // Atributos
    protected double precioBase;
    protected double valorAdicional;
    protected int anioFabricacion;
    protected int eslora;
    protected Capitan capitan;


    // Constructor
    public Embarcacion(double precioBase, double valorAdicional, int anioFabricacion, int eslora, Capitan capitan) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
        this.capitan = capitan;
    }


    // Métodos
    public double calcularMontoAlquiler () {
        if (this.anioFabricacion > 2020) {
            return this.precioBase + this.valorAdicional;
        } else {
            return this.precioBase;
        }
    }


    // Setters y getters
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }
}
