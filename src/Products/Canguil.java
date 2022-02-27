package Products;

public class Canguil extends Snack {
    public Canguil() {
        this.nombre = "Products.Canguil";
    }

    @Override
    public double getPrecio() {
        if (this.tamanio == "Grande") {
            return 2.60;
        }
        else if (this.tamanio == "Normal") {
            return 2.20;
        }
        else {
            return 1.85;
        }
    }
}
