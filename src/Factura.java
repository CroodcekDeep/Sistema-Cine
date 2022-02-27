import java.util.Date;

public class Factura {
    private Date fecha;
    private String ruc;
    private double total;
    private Orden orden;

    public Factura(Date fecha, String ruc, Orden orden) {
        this.fecha = fecha;
        this.ruc = ruc;
        this.total = orden.calcularTotal();
        this.orden = orden;
    }

    @Override
    public String toString() {
        return "\u001B[31mFACTURA:" +
                "\n\tRUC: " + ruc +
                "\n\tFecha: " + fecha +
                "\n\tORDEN: " + orden +
                "\n\tSubtotal: " + total +
                "\n\tTotal: " + (total * 1.12) +
                "\n\u001B[0m";
    }
}
