import Context.ShippingContext;
import Strategy.ExpressShippingStrategy;
import Strategy.NextDayDelivery;
import Strategy.StandardShippingStrategy;

public class Main {
    public static void main(String[] args) {
        ShippingContext shippingContext = new ShippingContext();

        // Standard Shipping
        shippingContext.setStrategy(new StandardShippingStrategy());
        System.out.println("Standard Shipping: " + shippingContext.calculateCharges(10.0, 100.0) + " | Time: " + shippingContext.getTime());

        // Express Shipping
        shippingContext.setStrategy(new ExpressShippingStrategy());
        System.out.println("Express Shipping: " + shippingContext.calculateCharges(10.0, 100.0) + " | Time: " + shippingContext.getTime());

        // Next Day Delivery
        shippingContext.setStrategy(new NextDayDelivery());
        System.out.println("Next Day Delivery: " + shippingContext.calculateCharges(10.0, 100.0) + " | Time: " + shippingContext.getTime());
    }
}
