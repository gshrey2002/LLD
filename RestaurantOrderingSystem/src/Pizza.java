public class Pizza implements Dish{

    @Override
    public String getName() {
        return "Pizza";
    }

    @Override
    public double getPrice() {
        return 110.0;
    }
}
