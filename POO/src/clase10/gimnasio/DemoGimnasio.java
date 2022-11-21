package clase10.gimnasio;

public class DemoGimnasio {

    public static void main(String[] args) {

        // Piscina
        Piscina piscina = new Piscina(140.90);

        // Socio
        Socio socio1 = new Socio("Milagros", "Valverde", 123);
        socio1.setCostoFijoMensual(1230.00);
        System.out.println(socio1.toString());
        System.out.println(socio1.costoDeCuotaMensual());

        Socio socio2 = new Socio("Lucia", "Valverde", 234);
        socio2.setCostoFijoMensual(1230.00);


        // Socio VIP
        SocioVip socioVip1 = new SocioVip("Natalia", "Sanguinetti", 435, true, false);
        socioVip1.ingresarAPiscina();

    }

}
