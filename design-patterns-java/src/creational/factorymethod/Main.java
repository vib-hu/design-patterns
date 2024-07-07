package creational.factorymethod;

import creational.factorymethod.document.DocumentCreator;
import creational.factorymethod.document.PdfDocumentCreator;
import creational.factorymethod.document.WordDocumentCreator;

public class Main {

    public static void main(String[] args){
        //document example
        DocumentCreator wordCreator = new WordDocumentCreator();
        DocumentCreator pdfCreator = new PdfDocumentCreator();
        wordCreator.openDocument();
        wordCreator.closeDocument();
        pdfCreator.openDocument();
        pdfCreator.closeDocument();

        //pizza example
        //non-refactored code

    }
}
