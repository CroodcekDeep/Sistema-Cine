package Products.extra;

import Products.snack.Snack;

public abstract class Extra extends Snack {
    protected Snack snack;
    protected String description;

    @Override
    public String toString() {
        return snack + " " + description;
    }
}
