package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class iphoneStockObservable implements StockObservable{
    public List<NotificationAlertObserver> observers=new ArrayList<>();
    public int stockCount=0;
    @Override
    public void addObserver(NotificationAlertObserver observer) {
    observers.add(observer);
    }

    @Override
    public void removeObserver(NotificationAlertObserver observer) {
    observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
    for(NotificationAlertObserver observer:observers){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
    if(stockCount==0 && newStockAdded>0){

        notifyObservers();
    }
        stockCount+=newStockAdded;}

    @Override
    public int getStockPrice() {
    return stockCount;
    }
}
