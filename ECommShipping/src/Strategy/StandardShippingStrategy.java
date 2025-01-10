package Strategy;

public class StandardShippingStrategy implements ShippingStrategy{


    @Override
    public Double calculateCost(Double weight, Double distance) {
        int baseCost=5;
        Double costAsPerWeight=baseCost+weight*2;
        Double totalCost=costAsPerWeight+distance/10;
        return totalCost;

    }

    @Override
    public String time() {
        return "Will Take approx  5-7 days";
    }
}
