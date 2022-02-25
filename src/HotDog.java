public class HotDog extends Snack {
    public HotDog() {
        this.nombre = "HotDog";
    }

    @Override
    public double getPrecio() {
        if (this.tamanio == "GRANDE") {
            return 4.00;
        }
        else {
            return 2.50;
        }
    }
}
