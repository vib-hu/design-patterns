package behavioral.state;

public class NoQuarterState implements State {

    private GumballMachine machine;

    public NoQuarterState(GumballMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Inserting the quarter");
        State state = machine.getHasQuarterState();
        machine.setState(state);
    }

    @Override
    public void ejectQuarter() {
        System.out.println("There is no quarter yet!");
    }

    @Override
    public void turnCrank() {
        System.out.println("You need to enter the quarter first");
    }

    @Override
    public void dispenseBall() {
        System.out.println("You need to play first");
    }
}
