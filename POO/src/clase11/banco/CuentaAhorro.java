package clase11.banco;

public class CuentaAhorro extends Cuenta{

    // Aributos
    private double tasaInteres = 1.5;


    // Constructor
    public CuentaAhorro(double saldo) {
        super(saldo);
    }

    // Métodos
    public void cobrarInteres() {
        this.saldo += this.saldo / 100 * this.tasaInteres;
    }

    @Override
    public void depositar(double monto) {
        this.saldo += monto;
        System.out.println("Se ha depositado a la cuenta. Su saldo es de: $" + this.saldo);
    }

    @Override
    public void extraer(double monto) {
        this.saldo -= monto;
        System.out.println("Se ha extraido a la cuenta. Su saldo es de: $" + this.saldo);
    }


    // Setters y getters
    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
}
