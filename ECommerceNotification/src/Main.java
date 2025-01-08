import Observer.Customer;
import Subject.ProductNew;


public class Main {
    public static void main(String[] args)
    {
        ProductNew electronics = new ProductNew("Electronics");
        ProductNew groceries = new ProductNew("Groceries");

        Customer cs1=new Customer("Shrey");
        electronics.addObserver(cs1);
        groceries.addObserver(cs1);
        electronics.addProduct("Smartphone");
        groceries.addProduct("vege");


//        electronics.removeObserver(cs1);
        electronics.addProduct("Watch");





    }
}