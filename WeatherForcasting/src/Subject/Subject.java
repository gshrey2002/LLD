package Subject;


import Observer.Observer;

public interface Subject {
    void registerObserver(Observer obs);

    void removeObserver(Observer obs);

    void notifyObservers();


}
