package structural.proxy.protectionproxy;

public class RealDocument implements Document {

    private String name;
    private String content;
    public RealDocument(String name, String content){
        this.name = name;
        this.content = content;
    }

    @Override
    public void edit(){
        System.out.println("Editing document: "+name);
    }

    @Override
    public void display(){
        System.out.println("Displaying document: "+name+" with content: "+content);
    }
}
