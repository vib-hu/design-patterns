package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {

    private List<FileSystemComponent> components;
    private String name;

    public Directory(String name){
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addFileSystemComponent(FileSystemComponent component){
        components.add(component);
    }

    public void removeFileSystemComponent(FileSystemComponent component){
        components.remove(component);
    }

    @Override
    public void showDetails(){
        System.out.println("Directory: "+name);
        for(FileSystemComponent component: components){
            component.showDetails();
        }
    }
}
