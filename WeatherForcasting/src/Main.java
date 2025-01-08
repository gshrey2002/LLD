import Observer.DisplayDevice;
import Subject.WeatherStation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        WeatherStation ws=new WeatherStation();

        DisplayDevice ds=new DisplayDevice("Accuweather");
        DisplayDevice ds2=new DisplayDevice("Weather Shrey");

        ws.registerObserver(ds);
        ws.registerObserver(ds2);

//        ws.setTemp(34);
//        ws.setHumidity(45);
//
//        ws.setTemp(69);
        ws.updateWeather(34,77);

        ws.removeObserver(ds);
//        ws.setHumidity(45);
        ws.updateWeather(34,69);


    }
}