package correct.beverages;

import correct.supplements.BeverageSupplement;

public class CoffeeWithMilkAndCream implements Beverage {
 
    private Beverage coffee;
    private Beverage milk;
    private BeverageSupplement cream;

    public CoffeeWithMilkAndCream(Beverage coffee, Beverage milk, BeverageSupplement cream) {
        this.coffee = coffee;
        this.milk   = milk;
        this.cream  = cream;
    }

    @Override
    public double price() {
        return this.coffee.price() + this.cream.supplementPrice() + this.milk.price();
    }
}