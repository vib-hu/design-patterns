package behavioral.observer;

public class ObserverClient {

    public void test(){
        CurrentConditionDisplay observer1 = new CurrentConditionDisplay(1);
        StatisticsDisplay observer2 = new StatisticsDisplay(2);

        WeatherService app = new WeatherService();
        app.registerObserver(observer1);
        app.registerObserver(observer2);

        app.setMeasurements(10, 11,12);

        System.out.println("Removing statistics display observer");

        app.removeObserver(observer2);
        app.setMeasurements(34,35,36);
    }
}
