import java.util.ArrayList;
import java.util.Arrays;

public class Orden {
    private int ordenID;
    private Cliente cliente;
    private Empleado empleado;
    private ArrayList<Producto> productos;

    public Orden(int ordenID, Cliente cliente, Empleado empleado, ArrayList<Producto> productos) {
        this.ordenID = ordenID;
        this.cliente = cliente;
        this.empleado = empleado;
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

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
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
                "\n\t\tCliente: " + cliente +
                "\n\t\tEmpleado: " + empleado +
                "\n\t\tProductos: " + productos +
                "\n\u001B[0m";
    }
}
