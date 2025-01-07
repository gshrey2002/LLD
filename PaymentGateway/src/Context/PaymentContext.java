package Context;

import Strategy.PaymentStrategy;

public class PaymentContext{
    private PaymentStrategy payment;

    public void setPayment(PaymentStrategy payment) {
        this.payment = payment;
    }

    public String initiatePayment(double amount){
        return payment.doPayment(amount);
    }
}
