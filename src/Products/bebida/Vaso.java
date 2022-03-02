package Products.bebida;

public class Vaso extends Bebida {

    public Vaso(String tamanio, String sabor) {
        this.nombre = "Vaso";
        this.tamanio = tamanio.toUpperCase();
        this.sabor = sabor.toUpperCase();
    }

    @Override
    public double getPrecio() {
        if (this.tamanio.equals("GRANDE")) {
            return 2.10;
        } else if (this.tamanio.equals("NORMAL")) {
            return 1.60;
        } else {
            return 1.20;
        }
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre +
                "\nPrecio: " + getPrecio() +
                "\nTamaño: " + tamanio +
                "\nSabor: " + sabor + "\n";
    }
}
