public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+",Sugar";
    }

    @Override
    public Double cost() {
        return coffee.cost()+5.0;
    }
}
