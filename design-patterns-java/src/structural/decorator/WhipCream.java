package structural.decorator;

import java.util.ArrayList;

public class WhipCream extends CondimentDecorator {

    Beverage beverage;
    public WhipCream(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    protected double cost() {
        return beverage.cost()+3;
    }

    @Override
    protected ArrayList<String> getInfo() {
//        var lst =    beverage.getInfo();
//        lst.add("WhipCream");
//        return lst;

        beverage.getInfo().add("WhipCream");
        //lst.add("Mocha");
        return beverage.getInfo();
    }
}
