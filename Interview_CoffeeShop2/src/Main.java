public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CoffeeInterface coffee=new CoffeeShop();
        coffee=new WhippingCreamDecorator(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getPrice());
    }
}