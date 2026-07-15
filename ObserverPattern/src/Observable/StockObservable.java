package Observable;

import Observer.NotificationAlertObserver;

public interface StockObservable {

    public void addObserver(NotificationAlertObserver observer);
    public void removeObserver(NotificationAlertObserver observer);
    public void notifyObservers();
    public void setStockCount(int newStockAdded);
    public int getStockPrice();
}
