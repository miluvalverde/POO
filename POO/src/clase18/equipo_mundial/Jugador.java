package clase18.equipo_mundial;

public class Jugador {

    // Atributos
    private String apellido;
    private String posicion;
    private int numeroDeCamiseta;


    // Constructor
    public Jugador(String apellido, String posicion, int numeroDeCamiseta) throws PosicionInexistenteException {
        this.apellido = apellido;
        this.posicion = this.validarPosicion(posicion);
        this.numeroDeCamiseta = numeroDeCamiseta;
    }


    // Métodos
    public String validarPosicion(String posicion) throws PosicionInexistenteException {
        if (posicion != "ARQUERO" || posicion != "DEFENSOR" || posicion != "MEDIOCAMPISTA" || posicion != "DELANTERO") {
            throw new PosicionInexistenteException();
        }
        return posicion;
    }

    @Override
    public String toString() {
        return "Jugador de apellido = " + apellido + ",  = " + posicion +
                ", numeroDeCamiseta = " + numeroDeCamiseta + '}';
    }


    // Getters y setters
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumeroDeCamiseta() {
        return numeroDeCamiseta;
    }

    public void setNumeroDeCamiseta(int numeroDeCamiseta) {
        this.numeroDeCamiseta = numeroDeCamiseta;
    }
}
