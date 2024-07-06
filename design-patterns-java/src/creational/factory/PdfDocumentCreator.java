package creational.factory;

public class PdfDocumentCreator extends DocumentCreator {

    @Override
    public Document createDocument(){
        return new PdfDocument();
    }
}
