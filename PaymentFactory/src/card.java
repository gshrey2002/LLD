public class card implements PaymentInterface{
    private final String cardnumber;
    private final int CVV;

    public card(String cardnumber, int CVV) {
        this.cardnumber = cardnumber;
        this.CVV = CVV;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("processing payment with Card");
    }
}
