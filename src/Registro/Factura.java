package Registro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Factura {
    private String fecha;
    private String ruc;
    private double total;
    private Orden orden;

    public Factura(String ruc, Orden orden) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
        fecha = LocalDateTime.now().format(df);
        this.ruc = ruc;
        this.total = orden.calcularTotal();
        this.orden = orden;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return "\u001B[31mFACTURA:" +
                "\n\tRUC: " + ruc +
                "\n\tFecha: " + fecha +
                "\n\tORDEN: " + orden +
                "\n\tSubtotal: " + String.format("%.3f", total) +
                "\n\tTotal: " + String.format("%.3f", (total * 1.12)) +
                "\n\u001B[0m";
    }
}
