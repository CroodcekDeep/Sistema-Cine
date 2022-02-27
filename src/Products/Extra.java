package Products;
public abstract class Extra extends Snack {
    protected Snack snack;
    protected String description;

    @Override
    public String toString() {
        return snack + " " + description;
    }
}
