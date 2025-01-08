package Observer;

public class Investors implements Observer{
    private String name;

    public Investors(String name) {
        this.name = name;
    }

    @Override
    public void update(float stockPrice) {
        System.out.println("Investor " + name + " notified. New Stock Price: $" + stockPrice);

    }
}
