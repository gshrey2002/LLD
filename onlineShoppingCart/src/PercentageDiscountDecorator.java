public class PercentageDiscountDecorator extends CartDecorator{
    public PercentageDiscountDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public String items() {
        return cart.items()+" 10% discount added";
    }

    @Override
    public Double totalCost() {
        return (cart.totalCost()-cart.totalCost()/10) ;
    }
}
