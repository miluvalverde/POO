package clase10.gimnasio;

public class SocioVip extends Socio {

    // Atributos
    private boolean poseeRevisionMedica;
    private boolean estaHabilitado;
    private Piscina piscina;


    // Constructor
    public SocioVip(String nombre, String apellido, int numeroSocio, boolean poseeRevisionMedica, boolean estaHabilitado) {
        super(nombre, apellido, numeroSocio);
        this.poseeRevisionMedica = poseeRevisionMedica;
        this.estaHabilitado = estaHabilitado;
    }


    // Métodos
    public void ingresarAPiscina() {
        if (this.poseeRevisionMedica == true && this.estaHabilitado == true) {
            System.out.println("Puede ingresar a la piscina");
        } else {
            System.out.println("No puede ingresar a la piscina");
        }
    }

    @Override
    public double costoDeCuotaMensual() {
        return this.costoFijoMensual + this.piscina.getCostoMensual();
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "\n" +
                "Apellido: " + this.apellido + "\n" +
                "Número de socio: " + this.numeroSocio + "\n" +
                "Se encuentra habilitado: " + this.estaHabilitado + "\n" +
                "Costo Mensual: " + this.costoDeCuotaMensual() + "\n";
    }


    // Setters y getters
    public boolean isPoseeRevisionMedica() {
        return poseeRevisionMedica;
    }

    public void setPoseeRevisionMedica(boolean poseeRevisionMedica) {
        this.poseeRevisionMedica = poseeRevisionMedica;
    }

    public boolean isEstaHabilitado() {
        return estaHabilitado;
    }

    public void setEstaHabilitado(boolean estaHabilitado) {
        this.estaHabilitado = estaHabilitado;
    }

    public Piscina getPiscina() {
        return piscina;
    }

    public void setPiscina(Piscina piscina) {
        this.piscina = piscina;
    }
}
