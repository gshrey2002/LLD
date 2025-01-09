public class Main {
    public static void main(String[] args) {
        Dish pizza = new Pizza();
//        System.out.println(pizza.getPrice());
        pizza = new CheeseDecorator(pizza);
        pizza = new SpicyDecorator(pizza);
        pizza = new FriesDecorator(pizza);

        System.out.println("Final Dish: " + pizza.getName());
        System.out.println("Total Price: " + pizza.getPrice());
    }
}
