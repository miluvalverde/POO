package clase17.pacientes;

public class FechaException extends Exception {

    public FechaException() {
        super("Operación incorrecta");
    }

    public FechaException(String message) {
        super(message);
    }
}
