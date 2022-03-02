package Products;

public abstract class Producto {
    protected String nombre;
    protected double precio;
    protected String tamanio;
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract double getPrecio();

    @Override
    public String toString() {
        return "\nNombre: " + nombre +
                "\nPrecio: " + getPrecio() +
                "\nTamaño: " + tamanio + "\n";
    }
}
