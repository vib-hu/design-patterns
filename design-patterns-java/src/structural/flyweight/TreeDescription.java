package structural.flyweight;

//Intrinsic State: immutable part of an object
public class TreeDescription {
    String name;
    String details;
    String icon;

    TreeDescription(String name, String details, String icon) throws DomainException {
        if(isEmpty(name)){
            throw new DomainException("Tree name can not be empty");
        }
        if(isEmpty(details)){
            throw new DomainException("Tree details can not be empty");
        }
        if(isEmpty(icon)){
            throw new DomainException("Tree icon can not be empty");
        }

        this.name = name;
        this.details = details;
        this.icon = icon;
    }

    public String getName(){
        return name;
    }

    public String getIcon(){
        return icon;
    }

    public String getDetails(){
        return details;
    }

    private boolean isEmpty(String value){
        return value==null || value.trim().isEmpty();
    }
}
