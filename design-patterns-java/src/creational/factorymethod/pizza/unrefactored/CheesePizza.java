package creational.factorymethod.pizza.unrefactored;

public class CheesePizza extends Pizza {

    @Override
    public void bake(){
        System.out.println("Bake on 60 degree");
    }
}
