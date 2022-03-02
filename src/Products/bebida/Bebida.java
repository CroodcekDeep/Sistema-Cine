package Products;

public abstract class Bebida extends Producto {
    protected String sabor;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

}
