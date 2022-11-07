package clase6.perro;


public class Perro {

    /*Para una institución que adopta perros se requiere tener de ellos: si están en adopción o
    no, raza, año aproximado de nacimiento, peso, si tiene o no chip, si está o no lastimado y el
    nombre de pila que le asignaron en la institución.
    Deberemos poder preguntar la edad de un perro y si es un perro factible de perderse
    —entendiendo que los perros que tienen chip son los que no se pueden perder—. Por otro
    lado, se puede enviar a adopción a un perro si no está lastimado y su peso es mayor a 5 kg.*/

    // Atributos
    private boolean enAdopcion;
    private String raza;
    private int anioNacimiento;
    private double peso;
    private boolean chip;
    private boolean lastimado;
    private String alias;


    // Constructores
    public Perro (String raza) {
        this.raza = raza;
    }

    public Perro (String raza, int anioNacimiento, double peso) {
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
    }


    // Getters
    public String getRaza () {
        return this.raza;
    }

    public boolean getEnAdopcion () {
        return this.enAdopcion;
    }

    public int getAnioNacimiento () {
        return this.anioNacimiento;
    }

    public double getPeso () {
        return this.peso;
    }

    public boolean getChip () {
        return this.chip;
    }

    public boolean getLastimado () {
        return this.lastimado;
    }

    public String getAlias () {
        return this.alias;
    }


    // Setters
    public void setRaza (String raza) {
        this.raza = raza;
    }

    public void setEnAdopcion (boolean enAdopcion) {
        this.enAdopcion = enAdopcion;
    }

    public void setAnioNacimiento (int fecha) {
        this.anioNacimiento = fecha;
    }

    public void setPeso (double peso) {
        this.peso = peso;
    }

    public void setChip (boolean chip) {
        this.chip = chip;
    }

    public void setLastimado (boolean lastimado) {
        this.lastimado = lastimado;
    }

    public void setAlias (String alias) {
        this.alias = alias;
    }


    // Métodos

    // Cálculo de la edad del perro
    public int edad () {
        return 2022 - this.anioNacimiento;
    }

    // Función que dice si el perro se pierde en función de si contiene chip o no
    public void perderse () {
        if (this.chip) {
            System.out.println("Este perro no se puede perder");
        } else {
            System.out.println("Este perro se puede perder");
        }
    }

    // Función que dice si el perro puede ser dado en adopción dependiendo si está lastimado o si pesa más de 5kg
    public void enviarAdopcion () {
        if (!this.lastimado && this.peso > 5.0) {
            System.out.println("Este perro se puede enviar en adopción");
            this.enAdopcion = true;
        } else {
            System.out.println("Este perro no se puede enviar en adopción");
            this.enAdopcion = false;
        }
    }


}
