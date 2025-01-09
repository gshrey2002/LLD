public class SpicyDecorator extends DishDecorator{
    public SpicyDecorator(Dish dish) {
        super(dish);
    }

    @Override
    public String getName() {
        return dish.getName()+",Spicy";
    }

    @Override
    public double getPrice() {
        return dish.getPrice()+5.0;
    }
}
