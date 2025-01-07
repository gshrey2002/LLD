import Context.PaymentContext;
import Strategy.CreditCardPayment;
import Strategy.DebitCardPayment;
import Strategy.UPIPayment;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        PaymentContext context=new PaymentContext();

        context.setPayment(new CreditCardPayment());
        System.out.println("cc payment "+ context.initiatePayment(50));

        context.setPayment(new DebitCardPayment());
        System.out.println("dc payment "+ context.initiatePayment(50));

        context.setPayment(new UPIPayment());
        System.out.println("upi payment "+ context.initiatePayment(50));
    }
}