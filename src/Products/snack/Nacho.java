package Products.snack;

public class Nacho extends Snack {
    public Nacho(String tamanio) {
        this.nombre = "Nacho";
        this.tamanio = tamanio.toUpperCase();
    }


    @Override
    public double getPrecio() {
        if (this.tamanio.equals("GRANDE")) {
            return 4.20;
        } else {
            return 3.95;
        }
    }
}
