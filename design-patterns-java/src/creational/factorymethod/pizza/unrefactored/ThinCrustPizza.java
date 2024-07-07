package creational.factorymethod.pizza.unrefactored;

public class ThinCrustPizza extends Pizza {

    @Override
    public void prepare(){
        System.out.println("prepare using thin crust dough");
    }
}
