import behavioral.observer.ObserverClient;
import behavioral.state.Client;
import structural.composite.CompositeClient;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Client client = new Client();
//        client.testChainOfResponsibility();
//        Client client = new Client();
//        client.testCommandPattern();

//        Client client = new Client();
//        client.textMemento();

//        Client client = new Client();
//        client.test();
//        Client client = new Client();
//        client.test();

//        Client client = new Client();
//        client.test();
//        ObserverClient client = new ObserverClient();
//        client.test();
        CompositeClient client = new CompositeClient();
        client.test();
    }
}