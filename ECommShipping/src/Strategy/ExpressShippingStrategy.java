package Strategy;

public class ExpressShippingStrategy implements ShippingStrategy{


    @Override
    public Double calculateCost(Double weight, Double distance) {
        int baseCost=10;
        Double costAsPerWeight=baseCost+weight*3;
        Double totalCost=costAsPerWeight+(distance/10)*2;
        return totalCost;

    }

    @Override
    public String time() {
        return "Will Take approx  2-3 days";
    }
}