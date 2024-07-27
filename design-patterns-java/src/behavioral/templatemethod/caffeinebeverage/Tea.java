package behavioral.templatemethod.caffeinebeverage;

public class Tea extends CaffeineBeverage {

    @Override
    void brew(){
        System.out.println("Brewing tea");
    }

    @Override
    void addCondiments(){
        System.out.println("No Condiments");
    }

    @Override
    public boolean customerWantsCondiments() {
        return false;
    }
}
