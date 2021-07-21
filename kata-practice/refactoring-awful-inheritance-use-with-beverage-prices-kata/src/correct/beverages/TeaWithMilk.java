package correct.beverages;

public class TeaWithMilk implements Beverage {

    private Beverage milk;
    private Beverage tea;

    public TeaWithMilk(Beverage milk, Beverage tea) {
        this.milk = milk;
        this.tea  = tea;
    }

    @Override
    public double price() {
        return this.tea.price() + this.milk.price();
    }
}