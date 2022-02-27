package Products;

public class Chile extends Extra {
    public Chile(Snack snack) {
        this.snack = snack;
        description = "con chile.";
    }

    @Override
    public double getPrecio() {
        return 0.40 + snack.getPrecio();
    }
}
