package Topic;

import Observer.Observer;

public interface Topics {
    String getCategoryName();
    void addObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObserver(String news);

}
