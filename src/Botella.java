public class Botella extends Bebida {

    public Botella(String nombre, double precio, String tamanio, String presentacion, String sabor) {
        this.nombre = nombre;
        this.precio = precio;
        this.tamanio = tamanio;
        this.descripcion = presentacion;
        this.sabor = sabor;
    }


    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        String salida;
        salida = "Nombre: " + nombre + "\n" +
                "Precio: " + precio + "\n" +
                "Tmanio: " + tamanio + "\n" +
                "Presentacion: " + descripcion + "\n" +
                "Sabor: " + sabor + "\n";

        return salida;
    }
}
