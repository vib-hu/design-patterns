package behavioral.templatemethod.caffeinebeverage;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Brewing Coffee");
    }

    @Override
    void addCondiments(){
        System.out.println("Adding condiments");
    }
}
