package Strategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public String doPayment(double amount) {
        return "Processing Payment with CreditCard of Amount "+amount;
    }
}
