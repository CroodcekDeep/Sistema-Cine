/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro;

/**
 *
 * @author GANDHY
 */
public class DetalleOrden {
    int cantidad;
    String producto;
    double precioUnit;
    double pvp;

    public DetalleOrden(int cantidad, String producto, double precioUnit, double pvp) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.precioUnit = precioUnit;
        this.pvp = pvp;
    }

    @Override
    public String toString() {
        return "DetalleOrden{" + "cantidad=" + cantidad + ", producto=" + producto + ", precioUnit=" + precioUnit + ", pvp=" + pvp + '}';
    }
    
}
