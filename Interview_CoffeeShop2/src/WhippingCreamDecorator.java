public class WhippingCreamDecorator extends CoffeeDecorator{


    public WhippingCreamDecorator(CoffeeInterface cs) {
        super(cs);
    }

    @Override
    public String getDescription() {
        return cs.getDescription()+" Whippibg cream";
    }

    @Override
    public Double getPrice() {
        return cs.getPrice()+20.0;
    }
}
