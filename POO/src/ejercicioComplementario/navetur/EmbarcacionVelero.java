package ejercicioComplementario.navetur;

public class EmbarcacionVelero extends Embarcacion {

    // Atributos
    private int numeroMastiles;


    // Constructor
    public EmbarcacionVelero(double precioBase, double valorAdicional, int anioFabricacion, int eslora, Capitan capitan) {
        super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
    }


    // Métodos
    public boolean esGrande() {
        return this.numeroMastiles > 4;
    }


    // Setters y getters
    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
}
