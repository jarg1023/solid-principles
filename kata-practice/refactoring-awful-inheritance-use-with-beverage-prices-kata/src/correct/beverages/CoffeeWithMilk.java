package correct.beverages;

public final class CoffeeWithMilk implements Beverage {

    private Beverage coffee;
    private Beverage milk;

    public CoffeeWithMilk(Beverage coffee, Beverage milk) {
        this.coffee = coffee;
        this.milk   = milk;
    }

    @Override
    public double price() {
        return this.coffee.price() + this.milk.price();
    }
}