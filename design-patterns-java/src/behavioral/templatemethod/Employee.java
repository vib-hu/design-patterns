package behavioral.templatemethod;

public class Employee implements Comparable {

    private int id;

    public Employee(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    @Override
    public int compareTo(Object obj) {
       Employee anotherEmployee =  (Employee)obj;
       if(anotherEmployee.id==this.id)
           return 0;
       else if (this.id> anotherEmployee.id)
           return 1;
       else
           return 0;
    }
}
