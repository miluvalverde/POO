package clase8.clinica;

public class MedicoCirujano extends Medico{

    // Atributos
    private MedicoAyudante[] ayudantes = new MedicoAyudante[2];


    // Constructor
    public MedicoCirujano(int numeroMatricula, String nombre, double importeHonorario) {
        super(numeroMatricula, nombre, importeHonorario);
    }


    // Métodos
    public double costo (double importeHonorario, MedicoAyudante[] ayudantes) {
        return importeHonorario + ayudantes[0].getImporteHonorario() + ayudantes[1].getImporteHonorario();
    }


    // Setters y getters
    public MedicoAyudante[] getAyudantes() {
        return ayudantes;
    }

    public void setAyudantes(MedicoAyudante[] ayudantes) {
        this.ayudantes = ayudantes;
    }
}
