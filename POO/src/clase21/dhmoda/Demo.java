package clase21.dhmoda;

public class Demo {

    public static void main(String[] args) {

        // Factory Method
        ProductoFactoryMethodSingleton factory = ProductoFactoryMethodSingleton.obtenerInstancia();


        // Telas
        Tela telaRazo = (Tela) factory.crearProducto("TELA");
        telaRazo.setNombre("Tela Razo");
        telaRazo.setPrecio(1250.0);
        telaRazo.setColor("blanco");

        Tela telaSeda = (Tela) factory.crearProducto("TELA");
        telaSeda.setNombre("Tela Seda");
        telaSeda.setPrecio(950.0);
        telaSeda.setColor("rosa");


        // Botón
        Boton botonGrande = (Boton) factory.crearProducto("BOTON");
        botonGrande.setNombre("Botón Grande");
        botonGrande.setPrecio(150.0);
        botonGrande.setColor("dorado");


        // Hilos
        Hilo hiloSeda1 = (Hilo) factory.crearProducto("HILO");
        hiloSeda1.setNombre("Hilo Seda");
        hiloSeda1.setPrecio(200.0);
        hiloSeda1.setColor("negro");

        Hilo hiloSeda2 = (Hilo) factory.crearProducto("HILO");
        hiloSeda2.setNombre("Hilo Seda");
        hiloSeda2.setPrecio(175.0);
        hiloSeda2.setColor("blanco");


        // Vestido
        PrendaDeVestirComposite vestidoNovia = (PrendaDeVestirComposite) factory.crearProducto("PRENDA DE VESTIR");
        vestidoNovia.agregarMaterial(telaRazo);
        vestidoNovia.agregarMaterial(telaSeda);
        vestidoNovia.agregarMaterial(hiloSeda2);
        vestidoNovia.setCostoManoDeObra(7500.0);


        // Mostrar
        vestidoNovia.mostrarMateriales();


        // Boleta
        Boleta boleta1 = new Boleta();
        boleta1.agregarProducto(telaSeda);
        boleta1.agregarProducto(telaRazo);
        boleta1.agregarProducto(hiloSeda1);
        boleta1.agregarProducto(hiloSeda2);
        boleta1.agregarProducto(botonGrande);
        boleta1.agregarProducto(vestidoNovia);
        boleta1.mostrarProductos();
        System.out.println(boleta1.calcularPrecio());
        boleta1.finalizarBoleta();

    }


}
