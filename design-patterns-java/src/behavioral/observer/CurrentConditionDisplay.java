package behavioral.observer;

import java.util.Objects;

public class CurrentConditionDisplay implements Observer {
    private int id;

    public CurrentConditionDisplay(int id){
        this.id = id;
    }

    public void update(float temperature, float humidity, float pressure){
        System.out.println("Displaying Temperature: "+temperature+" Humidity: "+humidity+" Pressure: "+pressure);
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null || getClass()!=obj.getClass()) return false;
        CurrentConditionDisplay that = (CurrentConditionDisplay)obj;
        return this.id == that.id;
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(id);
    }
}
