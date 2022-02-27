import Products.Producto;
import java.util.ArrayList;

public class Orden {
    private int ordenID;
    private Cliente cliente;
    private ArrayList<Producto> productos;

    @Override
    public String toString() {
        return "Orden{" +
                "ordenID=" + ordenID +
                ", cliente=" + cliente +
                ", productos=" + productos +
                '}';
    }

    public Orden(int ordenID, Cliente cliente){
        this.ordenID = ordenID;
        this.cliente = cliente;
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

    //TODO: add calcularTotal()
    //TODO: aniadirProducto() ?? logica



}
