package clase20.hamburgueseria;

import clase20.hamburgueseria.componentes.*;

public class Demo {

    public static void main(String[] args) {

        Sandwich sandwich1 = new Sandwich("Sandwich simple", 80.0 );
        Ensalada ensalada1 = new Ensalada("Ensalada simple", 120.0);
        Gaseosa gaseosa1 = new Gaseosa(" Coca", 20.0);
        PapaFrita papaFrita1 = new PapaFrita("Papa frita con mayonesa", 50.0);

        ComboComposite combo1 = new ComboComposite("Combo1");
        combo1.agregarProductos(sandwich1);
        combo1.agregarProductos(ensalada1);
        System.out.println("Precio final del combo 1: " + combo1.calcularPrecio());

        ComboComposite combo2 = new ComboComposite("Combo1");
        combo2.agregarProductos(gaseosa1);
        combo2.agregarProductos(papaFrita1);
        combo2.agregarProductos(sandwich1);
        System.out.println("Precio final del combo 2: " + combo2.calcularPrecio());

        Carrito carrito = new Carrito();
        carrito.agregarProductos(combo1);
        carrito.agregarProductos(combo2);

        System.out.println("Precio final de la compra: " + carrito.calcularTotalDeLaCompra());
    }

}
