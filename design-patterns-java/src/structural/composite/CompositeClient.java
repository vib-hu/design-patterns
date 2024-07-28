package structural.composite;

public class CompositeClient {

    public void test(){
        File file1 = new File("File 1");
        File file2 = new File("File 2");
        Directory directory1 = new Directory("Directory 1");
        directory1.addFileSystemComponent(file1);
        directory1.addFileSystemComponent(file2);

        File file3 = new File("File 3");
        Directory directory2 = new Directory("Directory 2");
        directory2.addFileSystemComponent(file3);
        directory2.addFileSystemComponent(directory1);

        directory2.showDetails();
    }
}
