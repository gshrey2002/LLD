package Context;

import Strategy.ShippingStrategy;

public class ShippingContext {
   private ShippingStrategy strategy;

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public Double calculateCharges(Double wight,Double distance){
        return strategy.calculateCost(wight,distance);

    }

    public String getTime(){
        return strategy.time();
    }
}
