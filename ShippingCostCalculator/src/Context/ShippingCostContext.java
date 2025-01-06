package Context;

import Strategy.ShippingCostStrategy;

public class ShippingCostContext {
    private ShippingCostStrategy Strategy;

    public void setStrategy(ShippingCostStrategy strategy) {
        this.Strategy = strategy;
    }

    public double calculateCharge( double distance,double weight) {
        return Strategy.calculateCost(distance,weight);
    }
}
