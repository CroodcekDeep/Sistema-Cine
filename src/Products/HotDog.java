package Products;

import Products.Snack;

public class HotDog extends Snack {
    public HotDog() {
        this.nombre = "Products.HotDog";
    }

    @Override
    public double getPrecio() {
        return 3.20;
    }
}
