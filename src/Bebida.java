public abstract class Bebida extends Producto {
    protected String descripcion;
    protected String sabor;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        String salida;
        salida = super.toString() + descripcion;
        return salida;
    }
}
