package Subject;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;


public class WeatherStation implements Subject{
    private List<Observer> obsList=new ArrayList<>();
    private float temp;
    private float humidity;




    @Override
    public void registerObserver(Observer obs) {
        obsList.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        obsList.remove(obs);
    }

    @Override
    public void notifyObservers() {
    for(Observer obi:obsList){
        obi.update(temp,humidity);
    }
    }

//    public void setTemp(float temp) {
//        this.temp = temp;
//        notifyObservers();
//    }

//    public void setHumidity(float humidity) {
//        this.humidity = humidity;
//        notifyObservers();
//    }

    public void updateWeather(float temp, float humidity) {
        this.temp = temp;
        this.humidity = humidity;
        notifyObservers();
    }

}
