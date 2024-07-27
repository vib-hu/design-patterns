package behavioral.state;

public class HasQuarterState implements State {

    private GumballMachine machine;

    public HasQuarterState(GumballMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can not insert quarter again");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Ejecting the quarter");
        State state = machine.getNoQuarterState();
        machine.setState(state);
    }

    @Override
    public void turnCrank() {
        State state = machine.getSoldState();
        machine.setState(state);
    }

    @Override
    public void dispenseBall() {
        System.out.println("You can not dispense Ball without turning crank");
    }
}
