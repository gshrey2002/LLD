public class CheeseDecorator extends DishDecorator{
    public CheeseDecorator(Dish dish) {
        super(dish);
    }

    @Override
    public String getName() {
        return dish.getName()+",Cheese";
    }

    @Override
    public double getPrice() {
        return dish.getPrice()+50.0;
    }
}
