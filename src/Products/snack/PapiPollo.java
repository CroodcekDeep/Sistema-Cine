package Products.snack;

public class PapiPollo extends Snack{
    public PapiPollo(String tamanio) {
        this.nombre = "Papi Pollo";
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

