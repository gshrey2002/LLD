package Subject;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class StockPriceTracker implements Subject{
    private List<Observer> observers=new ArrayList<>();
    private float StockPrice;
    @Override
    public void attach(Observer obs) {
    observers.add(obs);
    }

    @Override
    public void deAttach(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyInvestor() {
    for(Observer obs:observers){
        obs.update(StockPrice);
    }
    }

    public void setStockPrice(float stockPrice) {
        this.StockPrice = stockPrice;
        notifyInvestor();
    }
}
