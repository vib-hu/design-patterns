package structural.decorator;

public class Client {

    public static void main(String[] args){
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new WhipCream(beverage);
        print(beverage.cost());
        print(beverage.getInfo());
    }

    private static void print(Object message){
        System.out.println(message.toString());
    }

}
