package behavioral.state;

public class SoldState implements State {

    GumballMachine machine;
    public SoldState(GumballMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertQuarter(){
        System.out.println("You can not insert quarter now");
    }

    @Override
    public void ejectQuarter(){
        System.out.println("You can not eject quarter now");
    }

    @Override
    public void turnCrank(){
        System.out.println("You can not turn the crank again");
    }

    @Override
    public void dispenseBall(){
        System.out.println("Dispensing Ball");
        machine.dispenseBall();
        if(machine.getBalls()==0){
            System.out.println("No balls left");
            State state = machine.getSoldOutState();
            machine.setState(state);
        }else{
            State state = machine.getNoQuarterState();
            machine.setState(state);
        }
    }
}
