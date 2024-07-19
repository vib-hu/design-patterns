package behavioral.chainofresponsibility;

import java.time.Instant;

public class EmailValidationHandler extends ValidationHandler {

    public Boolean handleRequest(Request request){
        System.out.println("inside email validation handler");
        if(request.email == null || request.email.trim().isEmpty()){
            System.out.println("email validation failed");
            return false;
        }
        return invokeNext(request);
    }

    public void setNextHandler(ValidationHandler handler){
        this.nextHandler = handler;
    }
}
