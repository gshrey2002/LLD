public abstract class CartDecorator implements Cart{
protected Cart cart;

    public CartDecorator(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String items() {
        return null;
    }

    @Override
    public Double totalCost() {
        return null;
    }
}
