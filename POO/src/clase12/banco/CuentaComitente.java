package clase12.banco;

public class CuentaComitente extends Cuenta {

    // Atributos
    private String claveDeValidacion;


    // Constructor
    public CuentaComitente(double saldo, String claveDeValidacion) {
        super(saldo);
        this.claveDeValidacion = claveDeValidacion;
    }

    // Métodos
    @Override
    public void depositar(double monto) {
        this.saldo += (99 / monto * 100);
        System.out.println("Se ha depositado a la cuenta. Su saldo es de: $" + this.saldo);
    }

    @Override
    public void extraer(double monto) {
        if ((this.saldo / 2) >= 0) {
            this.saldo -= (monto / 2);
            System.out.println("Se ha extraido a la cuenta. Su saldo es de: $" + this.saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    public void extraerConClave(double monto, String clave) {
        if (this.claveDeValidacion.equals(clave) == true && this.saldo >= monto) {
            this.saldo -= monto;
            System.out.println("Se ha extraido a la cuenta. Su saldo es de: $" + this.saldo);
        } else {
            System.out.println("Clave incorrecta, vuelva a intentar");
        }
    }
}
