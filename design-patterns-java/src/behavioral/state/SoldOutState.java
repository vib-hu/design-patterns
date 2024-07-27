package behavioral.state;

public class SoldOutState implements State {
    GumballMachine machine;
    public SoldOutState(GumballMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertQuarter(){
        System.out.println("You can not insert quarter when sold-out");
    }

    @Override
    public void ejectQuarter(){
        System.out.println("You can not eject quarter when no quarter is there");
    }

    @Override
    public void turnCrank(){
        System.out.println("You can not turn the crank when sold-out");
    }

    @Override
    public void dispenseBall(){
        System.out.println("Can not dispense ball because sold-out");
    }
}
