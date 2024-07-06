package creational.factory;

public class PdfDocument implements Document {
    @Override
    public void open(){
        System.out.println("test");
    }

    @Override
    public void close(){
        System.out.println("test");
    }
}
