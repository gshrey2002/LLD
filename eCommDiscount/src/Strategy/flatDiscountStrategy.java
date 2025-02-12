package Strategy;

public class flatDiscountStrategy implements DiscountStrategy{

    @Override
    public double discountCalculator(Double totalPrice) {
        double total=totalPrice-150.0;
        return total;
    }
}
