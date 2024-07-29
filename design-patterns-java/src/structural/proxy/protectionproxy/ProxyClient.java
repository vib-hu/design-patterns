package structural.proxy.protectionproxy;

public class ProxyClient {

    public void test(){
        Document document = new RealDocument("resume.txt","My personal resume");
        User admin = new User("Admin User", "admin");
        User customer = new User("Mr X", "customer");
        User guestUser = new User("Mr Y", "guest");

        DocumentProxy proxy = new DocumentProxy(document,admin);
        proxy.edit();
        proxy.display();

        proxy = new DocumentProxy(document,customer);
        proxy.edit();
        proxy.display();

        proxy = new DocumentProxy(document,guestUser);
        proxy.edit();
        proxy.display();
    }
}
