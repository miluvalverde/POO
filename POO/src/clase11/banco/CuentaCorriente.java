package clase11.banco;

public class CuentaCorriente extends Cuenta{

    // Aributos
    private double montoParaGirar = 560;


    // Constructor
    public CuentaCorriente(double saldo) {
        super(saldo);
    }


    // Métodos

    @Override
    public void depositar(double monto) {
        this.saldo += monto;
        System.out.println("Se ha depositado a la cuenta. Su saldo es de: $" + this.saldo);
    }

    @Override
    public void extraer(double monto) {
        if ((this.saldo + this.montoParaGirar) >= monto) {
            this.saldo -= monto;
            System.out.println("Se ha extraido a la cuenta. Su saldo es de: $" + this.saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }


    // Setters y getters
    public double getMontoParaGirar() {
        return montoParaGirar;
    }

    public void setMontoParaGirar(double montoParaGirar) {
        this.montoParaGirar = montoParaGirar;
    }
}
