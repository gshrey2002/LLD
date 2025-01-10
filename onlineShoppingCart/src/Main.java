public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Cart shrey=new UsersCart();
        System.out.println(shrey.totalCost()+" normal price");
        shrey=new FlatDiscountDecorator(shrey);
        System.out.println(shrey.totalCost()+" Flat dsicount added");
        shrey=new PercentageDiscountDecorator(shrey);
        System.out.println(shrey.totalCost() +" after precent discount");
        shrey=new FreeShippingDecorator(shrey);
        System.out.println(shrey.totalCost() +" after free shipping discount");
    }
}