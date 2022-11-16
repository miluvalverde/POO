package clase8.clinica;

public class MedicoDermatologo extends Medico {

    // Constructor
    public MedicoDermatologo(int numeroMatricula, String nombre, double importeHonorario) {
        super(numeroMatricula, nombre, importeHonorario);
    }

    // Métodos
    public double cobro(double importeHonorario, Medicamento[] medicamentos) {
        return importeHonorario + medicamentos[0].getCostoMedicamento();
    }

    public void recetarMedicamento(Medicamento[] medicamentos) {
        System.out.println("Medicamento: " + medicamentos[0].getNombre());
    }


}
