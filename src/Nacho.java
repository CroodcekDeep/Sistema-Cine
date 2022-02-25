public class Nacho extends Snack{
    public Nacho() {
        this.nombre = "Nacho";
    }

    @Override
    public double getPrecio() {
        if (this.tamanio == "GRANDE") {
            return 4.00;
        }
        else {
            return 3.00;
        }
    }
}
