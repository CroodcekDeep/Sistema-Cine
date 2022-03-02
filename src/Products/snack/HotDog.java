package Products.snack;

public class HotDog extends Snack {
    public HotDog() {
        this.nombre = "HotDog";
        tamanio = "NORMAL";
    }

    @Override
    public double getPrecio() {
        return 3.20;
    }
}
