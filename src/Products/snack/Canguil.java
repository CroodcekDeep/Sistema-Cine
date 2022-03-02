package Products.snack;

public class Canguil extends Snack {
    public Canguil(String tamanio) {
        this.nombre = "Canguil";
        this.tamanio = tamanio.toUpperCase();
    }

  
    @Override
    public double getPrecio() {
        if (this.tamanio.equals("GRANDE")) {
            return 2.60;
        } else if (this.tamanio.equals("NORMAL")) {
            return 2.20;
        } else {
            return 1.85;
        }
    }

}
