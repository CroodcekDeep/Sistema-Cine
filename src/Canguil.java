public class Canguil extends Snack{
    public Canguil() {
        this.nombre = "Canguil";
    }

    @Override
    public double getPrecio() {
        if (this.tamanio == "Grande") {
            return 3.35;
        }
        else {
            return 2.85;
        }
    }
}
