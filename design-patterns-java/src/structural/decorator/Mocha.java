package structural.decorator;

import java.util.ArrayList;

public class Mocha extends CondimentDecorator {

    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    protected double cost() {
        return beverage.cost()+1;
    }

    @Override
    protected ArrayList<String> getInfo() {
        beverage.getInfo().add("Mocha");
        return beverage.getInfo();
    }
}
