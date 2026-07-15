public class MushroomTopping extends Toppings{
    BasePizza pizza;
    public MushroomTopping(BasePizza pizza){
        this.pizza=pizza;
    }
    @Override
    public int cost() {
        return 5+this.pizza.cost();
    }
}
