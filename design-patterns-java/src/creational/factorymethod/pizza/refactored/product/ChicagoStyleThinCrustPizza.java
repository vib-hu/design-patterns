package creational.factorymethod.pizza.refactored.product;

public class ChicagoStyleThinCrustPizza extends Pizza {

    @Override
    public void prepare(){
        System.out.println("prepare using thin crust dough");
    }
}
