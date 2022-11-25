package clase12.banco;

public class Cliente {

    // Atributos
    private int numeroCliente;
    private String apellido;
    private int dni;
    private String cuit;
    private Cuenta[] cuentas;


    // Constructor
    public Cliente(int numeroCliente, String apellido, int dni) {
        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
        this.dni = dni;
    }


    // Setters y getters
    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }
}
