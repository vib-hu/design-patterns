package structural.proxy.protectionproxy;

// Protection Proxy
public class DocumentProxy implements Document {

    private Document document;
    private User user;
    public DocumentProxy(Document document, User user){
        this.document = document;
        this.user = user;
    }

    @Override
    public void edit(){
        if(user==null)
            return;
        if(user.getRole().equals("admin")){
            document.edit();
            return;
        }
        System.out.println("Access denied: User "+user.getName()+" does not have permission to edit the document");
    }

    @Override
    public void display(){
        if(user==null)
            return;
        if(user.getRole().equals("customer") || user.getRole().equals("admin")){
            document.display();
            return;
        }
        System.out.println("Access denied: User "+user.getName()+" does not have permission to display the document");
    }
}
