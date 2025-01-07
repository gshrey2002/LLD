package Strategy;

public class UPIPayment implements PaymentStrategy{
    @Override
    public String doPayment(double amount) {
        return "Processing Payment with upi of "+amount;
    }
}
