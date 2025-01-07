package Strategy;

public class DebitCardPayment implements PaymentStrategy{
    @Override
    public String doPayment(double amount) {
        return "Processing payment with DebitCard of Amount "+amount;
    }
}
