package behavioral.chainofresponsibility;

public abstract class ValidationHandler {
    ValidationHandler nextHandler;
    abstract Boolean handleRequest(Request request);
    abstract void setNextHandler(ValidationHandler handler);

    public boolean invokeNext(Request request){
        if(nextHandler==null)
            return true;
        else
            return nextHandler.handleRequest(request);
    }
}
