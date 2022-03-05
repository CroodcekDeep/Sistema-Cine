package Registro;

import Products.Producto;

import java.util.ArrayList;

public class Orden {

    private Cliente cliente;
    private ArrayList<Producto> productos = new ArrayList<>();

    public Orden(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void anadirProducto(Producto producto) {
        this.productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        return "\n\tCliente: " + cliente
                + "\n\tProductos: " + productos + "\n";
    }
}
