package Context;

import Strategy.DiscountStrategy;

public class DiscountCOntext {
    private DiscountStrategy strategy;

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public Double calculateFinal(double total){
        return strategy.discountCalculator(total);
    }
}
