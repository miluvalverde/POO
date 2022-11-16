package clase8.clinica;

public class MedicoCardiologo extends Medico{

    // Constructor
    public MedicoCardiologo(int numeroMatricula, String nombre, double importeHonorario) {
        super(numeroMatricula, nombre, importeHonorario);
    }

    // Métodos
    public double cobro(double importeHonorario, Estudio[] estudios) {
        return importeHonorario + estudios[0].getCostoEstudio();
    }

    public void realizarEstudio(Estudio[] estudios) {
        System.out.println("Se realiza el estudio " + estudios[0].getNombre());
    }
}
