package Products.bebida;

public class Botella extends Bebida {

    public Botella(String sabor) {
        nombre = "Botella";
        tamanio = "Normal".toUpperCase();
        this.sabor = sabor.toUpperCase();
    }


    @Override
    public double getPrecio() {
        return 0.80;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre +
                "\nPrecio: " + getPrecio() +
                "\nTamaño: " + tamanio +
                "\nSabor: " + sabor + "\n";
    }
}
