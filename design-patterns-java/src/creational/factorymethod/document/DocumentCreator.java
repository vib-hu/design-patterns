package creational.factorymethod.document;

public abstract class DocumentCreator {
    public abstract Document createDocument();

    public void openDocument(){
        Document doc = createDocument();
        doc.open();
    }

    public void closeDocument(){
        Document doc = createDocument();
        doc.close();
    }
}
