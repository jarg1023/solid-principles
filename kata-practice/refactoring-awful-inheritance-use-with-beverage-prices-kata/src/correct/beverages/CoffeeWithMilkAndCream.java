package correct.beverages;

public class CoffeeWithMilkAndCream implements Beverage {
 
    private Beverage coffee;
    private Beverage cream;
    private Beverage milk;

    public CoffeeWithMilkAndCream(Beverage coffee, Beverage cream, Beverage milk) {
        this.coffee = coffee;
        this.cream  = cream;
        this.milk   = milk;
    }

    @Override
    public double price() {
        return this.coffee.price() + this.cream.price() + this.milk.price();
    }
}