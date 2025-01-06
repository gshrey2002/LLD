package Strategy;

public class ExpressShippingStrategy implements ShippingCostStrategy{
    @Override
    public double calculateCost(double distance, double weight) {
        double total=distance * 1.0 + weight * 0.5;
        return total;
    }
}
