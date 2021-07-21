package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import correct.beverages.Beverage;
import correct.beverages.Coffee;
import correct.beverages.CoffeeWithMilk;
import correct.beverages.CoffeeWithMilkAndCream;
import correct.beverages.Cream;
import correct.beverages.HotChocolate;
import correct.beverages.HotChocolateWithCream;
import correct.beverages.Milk;
import correct.beverages.Tea;
import correct.beverages.TeaWithCinnamon;
import correct.beverages.TeaWithMilk;
import correct.supplements.BeverageSupplement;
import correct.supplements.CinnamonSupplement;

public class BeveragesTest {

    @Test
    public void coffeePrice() {
        Beverage coffee = new Coffee();
        assertEquals(1.20, coffee.price());
    }

    @Test
    public void coffeeWithMilkPrice() {
        Beverage coffee = new Coffee();
        Beverage milk = new Milk();

        Beverage coffeeWithMilk = new CoffeeWithMilk(coffee, milk);

        assertEquals(1.30, coffeeWithMilk.price());
    }

    @Test
    public void coffeeWithMilkAndCreamPrice() {
        Beverage coffee = new Coffee();
        Beverage cream = new Cream();
        Beverage milk = new Milk();
        
        Beverage coffeeWithMilkAndCream = new CoffeeWithMilkAndCream(coffee, cream, milk);
        assertEquals(1.45, coffeeWithMilkAndCream.price());
    }

    @Test
    public void HotChocolateWithCreamPrice() {
        Beverage cream = new Cream();
        Beverage hotChocolate = new HotChocolate();

        Beverage hotChocolateWithCream = new HotChocolateWithCream(cream, hotChocolate);
        assertEquals(1.5999999999999999, hotChocolateWithCream.price());
    }

    @Test
    public void TeaWithMilkPrice() {
        Beverage milk = new Milk();
        Beverage tea = new Tea();

        Beverage teaWithMilk = new TeaWithMilk(milk, tea);
        assertEquals(1.6, teaWithMilk.price());
    }

    @Test
    public void teaWithCinnamonPrice() {
        BeverageSupplement cinnamon = new CinnamonSupplement();
        Beverage tea                = new Tea();

        Beverage teaWithCinnamon = new TeaWithCinnamon(cinnamon, tea);
        assertEquals(1.55, teaWithCinnamon.price());
    }
}
