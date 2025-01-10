package Strategy;

public class NextDayDelivery implements ShippingStrategy{


    @Override
    public Double calculateCost(Double weight, Double distance) {
        int baseCost=20;
        Double costAsPerWeight=baseCost+weight*3;
        Double totalCost=costAsPerWeight+(distance/10)*3;
        return totalCost;

    }

    @Override
    public String time() {
        return "Will Take approx  1 days";
    }
}

