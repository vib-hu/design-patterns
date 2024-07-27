package behavioral.templatemethod.caffeinebeverage;

public abstract class CaffeineBeverage {

    abstract void brew();
    abstract void addCondiments();

    private void boilWater(){
        System.out.println("Boiling Water");
    }
    private void pourInCup(){
        System.out.println("Pouring in Cup");
    }

    public boolean customerWantsCondiments(){
        return true;
    }

    public final void prepareBeverage(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments())
            addCondiments();
    }
}
