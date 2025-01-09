public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+",Milk";
    }

    @Override
    public Double cost() {
        return coffee.cost()+10.0;
    }
}
