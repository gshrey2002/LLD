import Observer.Investors;
import Subject.StockPriceTracker;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        StockPriceTracker stp=new StockPriceTracker();
        Investors investor1=new Investors("Shrey");
        Investors investor2=new Investors("Ali");


        stp.attach(investor1);
        stp.attach(investor2);

        stp.setStockPrice(103.4f);
        stp.setStockPrice(13.4f);

        stp.deAttach(investor1);

        stp.setStockPrice(169.4f);


    }
}