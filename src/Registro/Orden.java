package Registro;

import Products.Producto;
import java.util.ArrayList;

public class Orden {
    private int ordenID;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private Empleado empleado;


    public Orden(int ordenID, Cliente cliente, Empleado empleado) {
        this.ordenID = ordenID;
        this.cliente = cliente;
        this.empleado = empleado;

    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int getOrdenID() {
        return ordenID;
    }

    public void setOrdenID(int ordenID) {
        this.ordenID = ordenID;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
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
        return "\u001B[33mOrden:" +
                "\n\t\tIdOrden: " + ordenID +
                "\n\t\tRegistro.Cliente: " + cliente +
                "\n\t\tRegistro.Empleado: " + empleado +
                "\n\t\tProductos: " + productos +
                "\n\u001B[0m";
    }
}
