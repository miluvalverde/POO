package clase8.clinica;

public class MedicoGeneral extends Medico{

    // Constructor
    public MedicoGeneral(int numeroMatricula, String nombre, double importeHonorario) {
        super(numeroMatricula, nombre, importeHonorario);
    }


    // Métodos
    public double cobro (double importeHonorario) {
        return importeHonorario;
    }

}
