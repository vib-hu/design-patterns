package behavioral.state;

public class GumballMachine {

    private NoQuarterState noQuarterState;
    private HasQuarterState hasQuarterState;
    private SoldState soldState;
    private SoldOutState soldOutState;

    private State currentState;
    private int ballsCount;

    public GumballMachine(int balls){
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        ballsCount = balls;
        currentState = noQuarterState;
    }

    public State getNoQuarterState(){
        return noQuarterState;
    }

    public State getHasQuarterState(){
        return hasQuarterState;
    }

    public State getSoldState(){
        return soldState;
    }

    public State getSoldOutState(){
        return soldOutState;
    }

    public void setState(State state){
        this.currentState = state;
    }

    public void dispenseBall(){
        ballsCount--;
    }

    public int getBalls(){
       return ballsCount;
    }

    public void insertQuarter(){
       currentState.insertQuarter();
    }

    public void ejectQuarter(){
        currentState.ejectQuarter();
    }

    public void turnCrank(){
        currentState.turnCrank();
        currentState.dispenseBall();
    }
}
