public class CoffeeShop implements CoffeeInterface{

    @Override
    public String getDescription() {
        return "Basic Coffee ";
    }

    @Override
    public Double getPrice() {
        return 50.0;
    }
}
