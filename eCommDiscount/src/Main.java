import Context.DiscountCOntext;
import Strategy.flatDiscountStrategy;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        DiscountCOntext dc=new DiscountCOntext();
        dc.setStrategy(new flatDiscountStrategy());
        System.out.println("discount total flat Cost: " + dc.calculateFinal(1000.0));

    }
}