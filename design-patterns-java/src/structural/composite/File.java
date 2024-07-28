package structural.composite;

public class File implements FileSystemComponent {

    private String fileName;
    public File(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void showDetails(){
        System.out.println("File name is: "+fileName);
    }
}
