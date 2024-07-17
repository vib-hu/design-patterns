package structural.decorator;

import java.util.ArrayList;

public class HouseBlend extends Beverage {
    @Override
    protected double cost() {
        return 4;
    }

    @Override
    protected ArrayList<String> getInfo() {
        var lst = new ArrayList<String>();
        lst.add("House Blend");
        return lst;
    }
}
