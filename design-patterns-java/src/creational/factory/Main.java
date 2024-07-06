package creational.factory;

public class Main {

    public static void main(String[] args){
        DocumentCreator wordCreator = new WordDocumentCreator();
        DocumentCreator pdfCreator = new PdfDocumentCreator();

        wordCreator.openDocument();
        wordCreator.closeDocument();

        pdfCreator.openDocument();
        pdfCreator.closeDocument();
    }
}
