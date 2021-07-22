package correct.beverages;

import correct.supplements.BeverageSupplement;

public class HotChocolateWithCream implements Beverage {

    private Beverage hotChocolate;
    private BeverageSupplement cream;

    public HotChocolateWithCream(Beverage hotChocolate, BeverageSupplement cream) {
        this.hotChocolate = hotChocolate;
        this.cream        = cream;
    }

    @Override
    public double price() {
        return this.hotChocolate.price() + this.cream.supplementPrice();
    }
}