import behavioral.command.Client;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Client client = new Client();
//        client.testChainOfResponsibility();
        Client client = new Client();
        client.testCommandPattern();
    }
}