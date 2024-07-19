package behavioral.chainofresponsibility;

import java.time.Instant;
import java.time.LocalDateTime;

public class Client {

    public void TestChainOfResponsibility(){
        var nameHandler = new NameValidationHandler();
        var emailHandler = new EmailValidationHandler();
        nameHandler.setNextHandler(emailHandler);
        var dobHandler = new DobValidationHandler();
        emailHandler.setNextHandler(dobHandler);

        var request = new Request();
        request.setName("Vibhu", "Mishra");
        request.setEmail("vibhumishra808@gmail.com");
        request.setDob(LocalDateTime.of(2024,1,1,11,12,0));

         System.out.println(nameHandler.handleRequest(request));
    }
}
