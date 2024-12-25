package entities;

import java.util.List;

public class order {
    private String orderId;
    private List<product> product;

    private order(orderBuilder builder){
        this.orderId=builder.orderId;
        this.product=builder.product;

    }

    public static class orderBuilder{
        private final String orderId;
        private final List<product> product;

        public orderBuilder(String orderId, List<product> product) {
            this.orderId = orderId;
            this.product = product;
        }
        public order build(){
            return new order(this);
        }
    }


}
