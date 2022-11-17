package clase8.colegio;

public class Administrativo extends Persona {

    // Atributos
    private String cargo;


    // Constructor
    public Administrativo(String nombre, String apellido, String cargo) {
        super(nombre, apellido);
        this.cargo = cargo;
    }


    // Métodos
    public void realizarActividadesAdministrador() {
        //Lógica
    }


    // Setters y getters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
