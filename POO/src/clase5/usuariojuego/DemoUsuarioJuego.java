package clase5.usuariojuego;

import clase5.usuariojuego.UsuarioJuego;

public class DemoUsuarioJuego {

    public static void main(String[] args) {

        UsuarioJuego usuario1 = new UsuarioJuego("Milagros", "Milu2010");
        usuario1.aumentarPuntaje();
        usuario1.subirNivel();
        usuario1.bonus(120);

        UsuarioJuego usuario2 = new UsuarioJuego("Rodrigo", "Rodri234");
        usuario2.aumentarPuntaje();
        usuario2.subirNivel();
        usuario2.bonus(30);

        System.out.println(usuario1.getPuntaje());
        System.out.println(usuario1.getNivel());
        System.out.println(usuario2.getPuntaje());
        System.out.println(usuario2.getNivel());
    }


}
