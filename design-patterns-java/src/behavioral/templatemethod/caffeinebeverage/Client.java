package behavioral.templatemethod.caffeinebeverage;

public class Client {

    public void test(){
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        coffee.prepareBeverage();
        tea.prepareBeverage();
    }
}
