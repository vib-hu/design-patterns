package creational.factorymethod.document;

public class WordDocument implements Document{
    @Override
    public void open(){
        System.out.println("test");
    }

    @Override
    public void close(){
        System.out.println("test");
    }
}
