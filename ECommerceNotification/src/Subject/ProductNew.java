package Subject;

import Observer.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductNew implements ProductCategory{

    private Map<String,List<Observer>> categoryObserver=new HashMap<>();

    private List<String> products;
    private String categoryName;

    public ProductNew( String categoryName) {
        this.products = new ArrayList<>();
        this.categoryName = categoryName;
    }


    @Override
    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public void addObserver(Observer obv) {
    categoryObserver.putIfAbsent(categoryName,new ArrayList<>());
    categoryObserver.get(categoryName).add(obv);
    }

    @Override
    public void notifyObserver(String ProductName) {
        List<Observer> obss=categoryObserver.get(categoryName);
        if (obss != null) {
            for (Observer obs : obss) {
                obs.update(ProductName,categoryName);
            }
        }
    }

    @Override
    public void removeObserver(Observer obv) {
     List<Observer> obss=categoryObserver.get(categoryName);
        if (obss != null) {
            obss.remove(obv);
        }
    }

    public void addProduct(String productName) {
        products.add(productName);
        notifyObserver(productName);
    }
}
