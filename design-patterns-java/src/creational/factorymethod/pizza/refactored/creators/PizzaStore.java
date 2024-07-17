package creational.factorymethod.pizza.refactored.creators;

import creational.factorymethod.pizza.refactored.product.Pizza;
import creational.factorymethod.pizza.refactored.PizzaType;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType pizzaType){
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType pizzaType);
}
