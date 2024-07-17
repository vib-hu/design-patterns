package creational.factorymethod.pizza.refactored.creators;

import creational.factorymethod.pizza.refactored.product.NYStyleCheesePizza;
import creational.factorymethod.pizza.refactored.product.NYStyleThinCrustPizza;
import creational.factorymethod.pizza.refactored.product.Pizza;
import creational.factorymethod.pizza.refactored.PizzaType;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        if(pizzaType == PizzaType.Cheese)
            return new NYStyleCheesePizza();
        else if(pizzaType == PizzaType.ThinCrust)
            return new NYStyleThinCrustPizza();
        return null;
    }
}
