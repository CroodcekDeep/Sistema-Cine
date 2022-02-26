public class CarneMolida extends Extra {
    public CarneMolida(Snack snack) {
        this.snack = snack;
        description = "con carne molida.";
    }

    @Override
    public double getPrecio() {
        return 0.40 + snack.getPrecio();
    }
}
