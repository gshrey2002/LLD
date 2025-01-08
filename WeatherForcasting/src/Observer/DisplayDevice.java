package Observer;

public class DisplayDevice implements Observer
{
    private String aggregator;

    public DisplayDevice(String aggregator) {
        this.aggregator = aggregator;
    }

    @Override
    public void update(double temperature, double humidity) {
        System.out.println("Weather report for " + aggregator + "Temp: "+temperature + " Humidity: "+ humidity);
    }
}
