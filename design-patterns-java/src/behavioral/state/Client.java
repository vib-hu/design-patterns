package behavioral.state;

public class Client {

    public  void test(){
        GumballMachine machine = new GumballMachine(2);
        machine.insertQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();
    }
}
