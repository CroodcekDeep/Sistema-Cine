package Registro;

import Products.Producto;

import java.util.ArrayList;

public class Orden {
    private Cliente cliente;
    private Empleado empleado;
    private ArrayList<Producto> productos = new ArrayList<>();


    public Orden(Cliente cliente, Empleado empleado) {
        this.cliente = cliente;
        this.empleado = empleado;
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
        return "\u001B[33m" +
                "\n\tCliente: " + cliente +
                "\n\tEmpleado: " + empleado +
                "\n\tProductos: " + productos +
                "\n\u001B[0m";
    }
}
