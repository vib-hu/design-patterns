package creational.factorymethod.pizza.refactored.creators;

import creational.factorymethod.pizza.refactored.product.ChicagoStyleCheesePizza;
import creational.factorymethod.pizza.refactored.product.ChicagoStyleThinCrustPizza;
import creational.factorymethod.pizza.refactored.product.Pizza;
import creational.factorymethod.pizza.refactored.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        if(pizzaType == PizzaType.Cheese)
            return new ChicagoStyleCheesePizza();
        else if(pizzaType == PizzaType.ThinCrust)
            return new ChicagoStyleThinCrustPizza();
        return null;
    }
}
