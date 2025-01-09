package Subject;

import Observer.Observer;

public interface ChatAppInterface {
    void addObserver(Observer obv);
    void removeObserver(Observer obv);

    void notifyObserver(String Message);


}
