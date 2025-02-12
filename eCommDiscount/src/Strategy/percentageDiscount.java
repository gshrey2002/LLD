package Strategy;

public class percentageDiscount implements DiscountStrategy{
    @Override
    public double discountCalculator(Double totalPrice) {
        double total=totalPrice-(totalPrice*(15/100));
        return total;
    }
}
