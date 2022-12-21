package clase22.tren;

public class Demo {

    public static void main(String[] args) {

        CompuestoComposite figura1 = new CompuestoComposite();

        System.out.println("Haciendo locomotora: ");
        figura1.hacerLocomotora(1.0, 6.0, 4.0, 2.0, 2.0);
        System.out.println("El área de la locomotora es de: " + figura1.calcularArea());


        CompuestoComposite figura2 = new CompuestoComposite();
        System.out.println("Haciendo vagon");
        figura2.hacerVagon(1.0, 5.0, 4.0);
        System.out.println("El área del vagón es de: " + figura2.calcularArea());

    }

}
