package Strategy;

public class noDiscount implements DiscountStrategy{
    @Override
    public double discountCalculator(Double totalPrice) {
        return totalPrice;
    }
}
