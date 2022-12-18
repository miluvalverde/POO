package clase21.dhmoda;

import java.util.ArrayList;

public class PrendaDeVestirComposite extends Producto{

    // Atributos
    private ArrayList<Producto> materiales = new ArrayList();
    private double costoManoDeObra;
    private int descuento;


    // Métodos
    @Override
    public double calcularPrecio() {
        double contadorPrecio = 0;
        for (Producto producto : materiales) {
            contadorPrecio += producto.getPrecio();
        }
        return contadorPrecio + this.costoManoDeObra;
    }

    public void mostrarMateriales() {
        System.out.println("Para esta prenda de vestir se necesita de: ");
        for (Producto producto : materiales) {
            System.out.println(producto.getNombre() + " con el color " + producto.getColor());
        }
    }

    public void agregarMaterial(Producto producto) {
        materiales.add(producto);
    }

    public void quitarMaterial(Producto producto) {
        materiales.remove(producto);
    }


    // Getters y setters
    public ArrayList<Producto> getMateriales() {
        return materiales;
    }

    public double getCostoManoDeObra() {
        return costoManoDeObra;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setCostoManoDeObra(double costoManoDeObra) {
        this.costoManoDeObra = costoManoDeObra;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }


}
