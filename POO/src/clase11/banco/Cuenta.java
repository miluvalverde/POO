package clase11.banco;

public abstract class Cuenta {

    // Atributos
    protected double saldo;
    protected Cliente cliente;


    // Constructor
    public Cuenta(double saldo) {
        this.saldo = saldo;
    }


    // Métodos
    public abstract void depositar(double monto);


    public abstract void extraer(double monto);

    public double informarSaldo() {
        return this.saldo;
    }


    // Setters y getters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
