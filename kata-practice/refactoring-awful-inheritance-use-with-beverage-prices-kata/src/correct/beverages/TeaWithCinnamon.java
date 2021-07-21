package correct.beverages;

import correct.supplements.BeverageSupplement;

public class TeaWithCinnamon implements Beverage{

    private BeverageSupplement cinnamonSupplement;
    private Beverage tea;

    public TeaWithCinnamon(BeverageSupplement cinnamonSupplement, Beverage tea) {
        this.cinnamonSupplement = cinnamonSupplement;
        this.tea                = tea;
    }

    @Override
    public double price() {
        return this.tea.price() + this.cinnamonSupplement.supplementPrice();
    }
}