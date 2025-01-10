package Strategy;

public interface ShippingStrategy {
    Double calculateCost(Double weight,Double distance);
    String time();
}
