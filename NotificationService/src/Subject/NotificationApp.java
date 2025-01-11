package Subject;

import Observer.UserInterface;

import java.util.ArrayList;
import java.util.List;

public class NotificationApp implements notificationInterface{
    List<UserInterface> list=new ArrayList<>();

    private String notification;

    @Override
    public void addObserver(UserInterface us) {
list.add(us);
    }

    @Override
    public void removeObserver(UserInterface us) {
list.remove(us);
    }

    @Override
    public void notifyObserver() {
for(UserInterface us:list){
    us.update(notification);
}
    }
    public void addNOtification(String notification){
        this.notification=notification;
        notifyObserver();

    }
}
