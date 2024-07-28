package behavioral.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class WeatherService implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherService(){
        this.observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
        // If observers are being notified and an observer is removed during the notification,
        // a ConcurrentModificationException might be thrown.

        //The Observer objects must properly override the equals and hashCode methods
        // to ensure the correct object is removed.

        //If the list is large and the equals method is complex, removing an observer might be inefficient.

        //Safer Approach
        //Copying the list to avoid concurrent modification issues or use iterator
        //Ensuring proper implementation of equals and hashCode.
    }

    public void notifyObservers(){
//        for(Observer observer:observers){ // this will cause concurrent modification issues during observer removed
//            observer.update(this.temperature, this.humidity, this.pressure);
//        }
        Iterator<Observer> iterator = observers.iterator();
        while(iterator.hasNext()){
            Observer observer = iterator.next();
            observer.update(this.temperature, this.humidity, this.pressure);
        }

        // Another approach: create a copy of the list and then iterate
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementChanged();
    }

    public void measurementChanged(){
        notifyObservers();
    }
}
