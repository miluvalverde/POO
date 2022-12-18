package clase21.dhmoda;

public class ProductoFactoryMethodSingleton {

    // Atributos
    private static ProductoFactoryMethodSingleton instancia;


    // Constructor
    private ProductoFactoryMethodSingleton(){};


    // Métodos
    public static ProductoFactoryMethodSingleton obtenerInstancia() {
        if (ProductoFactoryMethodSingleton.instancia == null) {
            ProductoFactoryMethodSingleton.instancia = new ProductoFactoryMethodSingleton();
        }
        return ProductoFactoryMethodSingleton.instancia;
    }

    public Producto crearProducto (String tipo) {
        switch (tipo.toUpperCase()) {
            case "TELA":
                return new Tela();
            case "BOTON":
                return new Boton();
            case "HILO":
                return new Hilo();
            case "PRENDA DE VESTIR":
                return new PrendaDeVestirComposite();
        }
        return null;
    }


}
