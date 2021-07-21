package correct.beverages;

public class HotChocolateWithCream implements Beverage {

    private Beverage cream;
    private Beverage hotChocolate;

    public HotChocolateWithCream(Beverage cream, Beverage hotChocolate) {
        this.cream        = cream;
        this.hotChocolate = hotChocolate;
    }

    @Override
    public double price() {
        return this.hotChocolate.price() + this.cream.price();
    }
}