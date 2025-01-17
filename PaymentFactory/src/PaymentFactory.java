import java.util.HashMap;
import java.util.Map;

public class PaymentFactory {

    private static final Map<String ,PaymentSupplier> map=new HashMap<>();
    static {
        map.put("card",(identifier,cvv)->new card(identifier,cvv));
        map.put("upi",((identifier, cvv) -> new upi(identifier)));
    }
    public static PaymentInterface factory(String mode,String identifer,int cvv){
        PaymentSupplier supplier=map.get(mode.toLowerCase());
        return supplier.create(identifer,cvv);


    }
    public static void registerPaymentType(String mode, PaymentSupplier supplier) {
        map.put(mode.toLowerCase(), supplier);
    }
    @FunctionalInterface
    public interface PaymentSupplier {
        PaymentInterface create(String identifier, int cvv);
    }

}
