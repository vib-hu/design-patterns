package creational.factorymethod.pizza.refactored.product;

public class NYStyleCheesePizza extends Pizza {

    @Override
    public void bake(){
        System.out.println("Bake on 60 degree");
    }
}
