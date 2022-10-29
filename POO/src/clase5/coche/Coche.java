package clase5.coche;

public class Coche {

    // Atributos o propiedades
    // Siempre deben ser privados para que esto funcione como una 'caja negra'
    // Los privados pueden ser obtenidos desde la misma clase pero por ejemplo en la clase main no se puede
    private String marca; // Como es private hay que generar un setter
    public String modelo;
    public String color;
    public int anio;
    private double precio; // 1500
    private double costo; // 1000


    // Constantes
    // Se escribe con final, el tipo de dato y SIEMPRE en mayúscula
    public final double IVA = 12.5;


    // Setter para marca
    // SIEMPRE va con un parámetro y es void porque no debe devolver nada
    public void setMarca (String paraMarca) {
        this.marca = paraMarca;
    }


    // Getter obtiene un dato para retornarlo, en este caso para marca
    // NUNCA va con un parámetro
    public String getMarca () {
        return this.marca;
    }


    // Método estático
    // Para acceder a ellos debemos hacerlo con la clase ya que está acoplado a esta y no a los objetos
    public static double descuentoPorcentualPorPagoEfectivo = 15.0;


    // Métodos públicos
    public double calcularPrecio (double costo, double margenPorcentual) {
        return this.precio = costo + calcularElMargen(costo, margenPorcentual);
    }

    // Esta función podría no hacerse pero es para dividir funciones
    private double calcularElMargen (double costo, double margenPorcentual) {
        return costo / 100 * margenPorcentual;
    }

    public void encender () {
        // Lógica
    }

    public void avanzar () {
        // Lógica
    }

    public void frenar () {
        // Lógica
    }

}
