package Products.snack;

public class PapiPollo extends Snack{
    public PapiPollo(String tamanio) {
        this.nombre = "Papi Pollo";
        this.tamanio = tamanio.toUpperCase();
    }


    @Override
    public double getPrecio() {
        if (this.tamanio.equals("GRANDE")) {
            return 2.5;
        } else {
            return 1.5;
        }
    }
}

