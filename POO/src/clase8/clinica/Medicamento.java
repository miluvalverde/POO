package clase8.clinica;

public class Medicamento {

    // Atributos
    private double costoMedicamento;
    private String nombre;


    // Constructor
    public Medicamento(double costoMedicamento, String nombre) {
        this.costoMedicamento = costoMedicamento;
        this.nombre = nombre;
    }


    // Setters y getters
    public double getCostoMedicamento() {
        return costoMedicamento;
    }

    public void setCostoMedicamento(double costoMedicamento) {
        this.costoMedicamento = costoMedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
