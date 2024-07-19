package behavioral.chainofresponsibility;

public class NameValidationHandler extends ValidationHandler {

    public Boolean handleRequest(Request request){
        System.out.println("inside name validation handler");
        if(request.firstName == null || request.firstName.trim().isEmpty() || request.lastName ==null ||
                request.lastName.trim().isEmpty()){
            System.out.println("name validation failed");
            return false;
        }
        return invokeNext(request);
    }

    public void setNextHandler(ValidationHandler handler){
        this.nextHandler = handler;
    }
}
