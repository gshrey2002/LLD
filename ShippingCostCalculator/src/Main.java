import Context.ShippingCostContext;
import Strategy.ExpressShippingStrategy;
import Strategy.OvernightShippingStrategy;
import Strategy.StandardShippingStrategy;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        ShippingCostContext shippingCostContext = new ShippingCostContext();

        shippingCostContext.setStrategy(new StandardShippingStrategy());
        System.out.println("Standard Shipping Cost: " + shippingCostContext.calculateCharge(100, 20));

        shippingCostContext.setStrategy(new ExpressShippingStrategy());
        System.out.println("Express Shipping Cost: " + shippingCostContext.calculateCharge(100, 20));

        shippingCostContext.setStrategy(new OvernightShippingStrategy());
        System.out.println("Overnight Shipping Cost: " + shippingCostContext.calculateCharge(100, 20));
    }
}