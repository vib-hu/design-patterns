package behavioral.observer;

import behavioral.state.State;

import java.util.Objects;

public class StatisticsDisplay implements Observer {

    private int id;
    public StatisticsDisplay(int id){
        this.id = id;
    }

    public void update(float temperature, float humidity, float pressure){
        System.out.println("Displaying Statistics. Temperature: "+temperature+" Humidity: "+humidity+" Pressure:"+pressure);
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null || obj.getClass()!=this.getClass()) return false;
        return this.id == ((StatisticsDisplay) obj).id;
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(id);
    }
}
