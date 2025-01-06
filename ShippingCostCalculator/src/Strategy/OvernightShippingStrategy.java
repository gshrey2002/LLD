package Strategy;

public class OvernightShippingStrategy implements ShippingCostStrategy{
    @Override
    public double calculateCost(double distance, double weight) {
        double total=distance * 2.0 + weight * 1.0;
        return total;
    }
}
