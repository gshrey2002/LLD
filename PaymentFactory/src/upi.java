public class upi implements PaymentInterface{

    private String upiId;

    public upi(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment with Upi");
    }

}
