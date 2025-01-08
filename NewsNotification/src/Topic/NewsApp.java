package Topic;

import Observer.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewsApp implements Topics{
    private Map<String, List<Observer>> categoryObserver=new HashMap<>();
    private String CategoryName;
    private List<String> news;

    public NewsApp(String categoryName) {
        this.CategoryName = categoryName;
        this.news = new ArrayList<>();
    }

    @Override
    public String getCategoryName() {
    return CategoryName;
    }

    @Override
    public void addObserver(Observer obs) {
        categoryObserver.putIfAbsent(CategoryName,new ArrayList<>());
        categoryObserver.get(CategoryName).add(obs);
    }

    @Override
    public void notifyObserver(String news) {
        List<Observer> listObs=categoryObserver.get(CategoryName);
        if(listObs!=null){
            for(Observer obii:listObs){
    obii.update(news,CategoryName);
            }
        }

    }

    @Override
    public void removeObserver(Observer obs) {
        List<Observer> listObs=categoryObserver.get(CategoryName);
//        categoryObserver.get(CategoryName).remove(obs);
        if (listObs!=null){
            listObs.remove(obs);
        }

    }

    public void addNews(String newsName){
news.add(newsName);
notifyObserver(newsName);
    }
}
