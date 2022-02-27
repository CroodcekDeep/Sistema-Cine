package Products;

import Products.Bebida;

public class Vaso extends Bebida {

    public Vaso(String nombre, double precio, String tamanio, String sabor) {
        this.nombre = nombre;
        this.precio = precio;
        this.tamanio = tamanio;
        this.sabor = sabor;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        String salida;
        salida = "Nombre: " + nombre + "\n" +
                "Precio: " + precio + "\n" +
                "Tamanio: " + tamanio + "\n" +
                "Sabor: " + sabor + "\n";

        return salida;

    }
}
