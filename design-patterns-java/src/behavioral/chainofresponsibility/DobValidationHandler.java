package behavioral.chainofresponsibility;

import java.time.LocalDateTime;

public class DobValidationHandler extends ValidationHandler {

    public Boolean handleRequest(Request request){
        System.out.println("inside dob validation handler");
        if(request.dob.isAfter(LocalDateTime.now())){
            System.out.println("Dob validation failed");
            return false;
        }
        return invokeNext(request);
    }

    public void setNextHandler(ValidationHandler handler){
        this.nextHandler = handler;
    }
}
