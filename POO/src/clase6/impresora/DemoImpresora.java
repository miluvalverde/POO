package clase6.impresora;

import java.util.Date;

public class DemoImpresora {

    public static void main(String[] args) {


        Date fecha = new Date(2022, 10, 23);

        Impresora impresora1 = new Impresora("Cannon3110", "Inalámbrica");
        impresora1.setFechaDeFabricacion(fecha);
        impresora1.setCantidadDeHojas(120);
        impresora1.imprimir("Holaaa", 10);


        Impresora impresora2 = new Impresora("HP1102", "USB");
        impresora1.setCantidadDeHojas(5);

    }


}
