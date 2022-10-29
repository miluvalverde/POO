package clase5.coche;


import clase5.coche.Coche;

public class DemoCoche {

    public static void main(String[] args) {

        Coche coche1 = new Coche(); // Crear una instancia coche1
        coche1.setMarca("Ford"); // Se pasa el string de la marca como parámetro del setter
        coche1.modelo = "Fiesta";
        coche1.color = "Negro";
        coche1.anio = 2020;
        // coche1.precio = 15000.00;
        coche1.calcularPrecio(1000.0, 50.0);
        coche1.encender();
        coche1.avanzar();
        coche1.frenar();

        Coche coche2 = new Coche(); // Crear una instancia coche2
        coche2.setMarca("Ford");
        coche2.modelo = "Mustang";
        coche2.color = "Azul";
        coche2.anio = 2012;
        //coche2.precio = 1445000.00;
        coche2.calcularPrecio(1000.0, 50.0);
        coche2.encender();
        coche2.avanzar();
        coche2.frenar();


        System.out.println(coche2.getMarca());
        System.out.println(Coche.descuentoPorcentualPorPagoEfectivo);
        System.out.println(coche2.IVA);
    }

}
