package Registro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Factura {

    private String nombreEmpresa = "Star Cines";
    private String ruc = "1768156470004";
    private String fecha;
    private double total;
    private Orden orden;

    public Factura(Orden orden) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
        fecha = LocalDateTime.now().format(df);
        //this.total = orden.calcularTotal();
        this.orden = orden;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        return "FACTURA:"
                + "\n\tNombre Empresa: " + nombreEmpresa
                + "\n\tRUC: " + ruc
                + "\n\tFecha: " + fecha
                + "\n\tORDEN: " + orden
                + "\n\tSubtotal: " + String.format("%.3f", total)
                + "\n\tTotal: " + String.format("%.3f", (total * 1.12)) + "\n";
    }
}
