public class ExtraCheese extends Toppings{

    BasePizza basepizza;
    public ExtraCheese(BasePizza pizza){
        this.basepizza=pizza;
    }


    @Override
    public int cost() {
        return 10+this.basepizza.cost();
    }
}
