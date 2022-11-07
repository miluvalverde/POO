package clase6.perro;

public class DemoPerro {

    public static void main(String[] args) {

        Perro perro1 = new Perro("Collie");
        perro1.setChip(true);
        perro1.setAlias("perro12");
        perro1.setAnioNacimiento(2003);
        perro1.setPeso(7.3);
        perro1.setEnAdopcion(true);
        perro1.setLastimado(false);

        System.out.println(perro1.edad());
        perro1.perderse();
        perro1.enviarAdopcion();

        Perro perro2 = new Perro("Beagle", 2014, 15.3);
        perro2.setLastimado(true);
        perro2.setChip(false);
        perro2.setAlias("perro13");
        perro2.setEnAdopcion(false);

        System.out.println(perro2.edad());
        perro2.perderse();
        perro2.enviarAdopcion();

    }

}
