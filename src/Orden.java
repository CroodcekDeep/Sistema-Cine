public class Orden {
    private int ordenID;
    private Cliente cliente;
    //TODO: Añadir un array de objetos del tipo producto
    //TODO: Crear la clase producto.

    public Orden(int ordenID, Cliente cliente){
        this.ordenID = ordenID;
        this.cliente = cliente;
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
}
