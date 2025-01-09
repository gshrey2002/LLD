package Subject;

import Observer.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatApp implements ChatAppInterface{
    private Map<String, List<Observer>> observerList=new HashMap<>();
    private String name;
    private List<String > list;

    public ChatApp(String name) {
        this.name = name;
        this.list = new ArrayList<String>();
    }

    @Override
    public void addObserver(Observer obv) {
    observerList.putIfAbsent(name,new ArrayList<>());
    observerList.get(name).add(obv);
    }

    @Override
    public void notifyObserver(String Message) {
        List<Observer> obs=observerList.get(name);
        if(!obs.isEmpty()){
            for(Observer obii:obs){
                obii.update(Message,name);
            }
        }

    }

    @Override
    public void removeObserver(Observer obv) {
    List<Observer> obs=observerList.get(name);
    if(!obs.isEmpty()){
        obs.remove(obv);
    }
    }

    public void addMessage(String message){
        list.add(message);
        notifyObserver(message);
    }
}
