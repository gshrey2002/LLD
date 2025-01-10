public class FlatDiscountDecorator extends CartDecorator{
    public FlatDiscountDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public String items() {
        return cart.items()+" Flat Discount added";
    }

    @Override
    public Double totalCost() {
        return cart.totalCost()-100;
    }
}
