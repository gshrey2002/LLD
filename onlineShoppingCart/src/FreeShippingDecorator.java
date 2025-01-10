public class FreeShippingDecorator extends CartDecorator{
    public FreeShippingDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public String items() {
        return cart.items()+" Free Shipping added";
    }

    @Override
    public Double totalCost() {
        return cart.totalCost()-40;
    }
}
