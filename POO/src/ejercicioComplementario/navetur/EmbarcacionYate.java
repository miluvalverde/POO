package ejercicioComplementario.navetur;

public class EmbarcacionYate extends Embarcacion implements Comparable<EmbarcacionYate>{

    // Atributos
    private int cantidadCamarotes;


    // Constructor
    public EmbarcacionYate(double precioBase, double valorAdicional, int anioFabricacion, int eslora, Capitan capitan) {
        super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
    }


    // Métodos
    @Override
    public int compareTo(EmbarcacionYate embarcacionYate) {
        if (this.cantidadCamarotes > embarcacionYate.cantidadCamarotes) {
            return 1;
        } else if (this.cantidadCamarotes < embarcacionYate.cantidadCamarotes) {
            return -1;
        } else {
            return 0;
        }
    }


}
