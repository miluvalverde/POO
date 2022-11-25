package clase12.banco;

public class DemoBanco {

    public static void main(String[] args) {

        // Cliente
        Cliente cliente1 = new Cliente(234, "Valverde", 4563348);


        // Cuenta de ahorro
        CuentaAhorro cuentaAhorro1 = new CuentaAhorro(3440);
        cuentaAhorro1.setCliente(cliente1);
        cuentaAhorro1.cobrarInteres();
        cuentaAhorro1.depositar(400);
        cuentaAhorro1.extraer(30);


        // Cuenta corriente
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(4500);
        cuentaCorriente1.extraer(5000);
        cuentaCorriente1.setCliente(cliente1);

        // Cuenta comitente
        CuentaComitente cuentaComitente1 = new CuentaComitente(3400, "HolaMundo");
        cuentaComitente1.setCliente(cliente1);
        cuentaComitente1.extraer(300);
        cuentaComitente1.extraerConClave(406, "HolaMundo");


        // Asigno las cuentas al cliente
        cliente1.setCuentas(new Cuenta[]{cuentaAhorro1, cuentaCorriente1, cuentaComitente1});
    }

}
