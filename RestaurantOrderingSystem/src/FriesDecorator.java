public class FriesDecorator extends DishDecorator{
    public FriesDecorator(Dish dish) {
        super(dish);
    }

    @Override
    public String getName() {
        return dish.getName()+",Fries";
    }

    @Override
    public double getPrice() {
        return dish.getPrice()+55.0;
    }
}
