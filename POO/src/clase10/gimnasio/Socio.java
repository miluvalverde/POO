package clase10.gimnasio;

public class Socio {

    // Atributos
    protected String nombre;
    protected String apellido;
    protected int numeroSocio;
    protected double costoFijoMensual;
    protected boolean pagoCuota;


    // Constructor
    public Socio(String nombre, String apellido, int numeroSocio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSocio = numeroSocio;
    }


    // Métodos
    public double costoDeCuotaMensual() {
        return this.costoFijoMensual;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "\n" +
                "Apellido: " + this.apellido + "\n" +
                "Número de socio: " + this.numeroSocio + "\n" +
                "Costo Mensual: " + this.costoDeCuotaMensual() + "\n";
    }


    // Setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public double getCostoFijoMensual() {
        return costoFijoMensual;
    }

    public void setCostoFijoMensual(double costoFijoMensual) {
        this.costoFijoMensual = costoFijoMensual;
    }

    public boolean isPagoCuota() {
        return pagoCuota;
    }

    public void setPagoCuota(boolean pagoCuota) {
        this.pagoCuota = pagoCuota;
    }
}

