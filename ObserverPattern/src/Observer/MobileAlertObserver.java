package Observer;

import Observable.StockObservable;

public class MobileAlertObserver implements  NotificationAlertObserver {
    StockObservable observable;
    String userName;
    public MobileAlertObserver(StockObservable stockObservable,String userName) {
        this.observable = stockObservable;
    this.userName=userName;
    }
    @Override
    public void update() {
        sendMessage(userName,"Stock price changed! Check the app for details.");
    }
    private void sendMessage(String userName,String message) {
        System.out.println("Sending mobile alert to " + userName + ": " + message);
    }
}
