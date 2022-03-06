package Registro;

import Products.Producto;

import java.util.ArrayList;

public class Orden {

    private Cliente cliente;
    private ArrayList<DetalleOrden> detallesOrden = new ArrayList<>();

    public Orden(Cliente cliente) {
        this.cliente = cliente;
    }

    public Orden(){}

    public ArrayList<DetalleOrden> getDetallesOrden() {
        return detallesOrden;
    }

    public void setDetallesOrden(ArrayList<DetalleOrden> detallesOrden) {
        this.detallesOrden = detallesOrden;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

//    public void anadirProducto(Producto producto) {
//        this.productos.add(producto);
//    }
    
    public void anadirDetalleOrden(DetalleOrden detalle) {
        this.detallesOrden.add(detalle);
    }

    public double calcularTotal() {
        double total = 0;
        for (DetalleOrden d: detallesOrden) {
            total += d.pvp;
        }
        return total;
    }

    @Override
    public String toString() {
        return "\n\tCliente: " + cliente
                + "\n\tDetalles: " + detallesOrden + "\n";
    }
}
