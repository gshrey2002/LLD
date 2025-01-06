package Strategy;

public class StandardShippingStrategy implements ShippingCostStrategy
{

    @Override
    public double calculateCost(double distance, double weight) {
        double total=distance * 0.5 + weight * 0.2;
        return total;
    }
}
