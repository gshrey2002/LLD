//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Observable.StockObservable;
import Observable.iphoneStockObservable;
import Observer.NotificationAlertObserver;
import Observer.MobileAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable stockObservable = new iphoneStockObservable();
        NotificationAlertObserver obs = new MobileAlertObserver(stockObservable, "John");
        stockObservable.addObserver(obs);

        stockObservable.setStockCount(1);
    }
}