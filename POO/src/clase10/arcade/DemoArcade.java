package clase10.arcade;

import java.util.Scanner;

public class DemoArcade {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Reglas
        System.out.println("La nave espacial solo se puede mover en cuatro direcciones: " + "\n" +
                "N (norte), S (sur) + E(este) u O (oeste)");


        // Nave
        Nave nave1 = new Nave(0, 0, "S", 30);
        System.out.println("Ingrese la dirección en la que se moverá la nave: ");
        String direccionNave = scanner.nextLine();
        nave1.irA(124, 342, direccionNave);


        // Asteroide
        Asteroide asteroide1 = new Asteroide(0, 0, "N", 20);
        asteroide1.irA(346, 87, "S");
    }

}
