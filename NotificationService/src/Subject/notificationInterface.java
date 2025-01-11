package Subject;

import Observer.UserInterface;

public interface notificationInterface {
   void addObserver(UserInterface us);
   void removeObserver(UserInterface us);
   void notifyObserver();
}
