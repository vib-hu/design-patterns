package structural.decorator;
import java.util.*;

public class Espresso extends Beverage {

    @Override
    protected double cost() {
        return 2;
    }

    @Override
    protected ArrayList<String> getInfo() {
        var lst = new ArrayList<String>();
        lst.add("Espresso");
       return lst;
    }
}
