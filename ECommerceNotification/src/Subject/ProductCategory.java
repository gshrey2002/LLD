package Subject;

import Observer.Observer;

public interface ProductCategory {
//    String productName();
    String getCategoryName();
    void addObserver(Observer obv);

    void removeObserver(Observer obv);

    void notifyObserver(String ProductName);

}
