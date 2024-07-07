package creational.factorymethod.pizza.unrefactored;

public class Client {

    public Pizza orderPizza(String pizzaType){

        //initial version - only one type of pizza
//        Pizza pizza = new Pizza();
//        pizza.prepare();
//        pizza.bake();
//        pizza.cut();
//        pizza.box();
//        return pizza;

        //new pizza types added
        Pizza pizza;
        if(pizzaType.equals("cheese"))
            pizza = new CheesePizza();
        else if (pizzaType.equals("thinCrust"))
            pizza = new ThinCrustPizza();
        else
            pizza = new Pizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
