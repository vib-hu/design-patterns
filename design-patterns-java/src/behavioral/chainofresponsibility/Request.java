package behavioral.chainofresponsibility;

import java.time.LocalDateTime;
import java.util.Date;

public class Request {
    LocalDateTime dob;
    String firstName;
    String lastName;
    String email;
    public void setDob(LocalDateTime dob){
        this.dob= dob;
    }

    public void setName(String firstName, String lastName){
        this.firstName= firstName;
        this.lastName = lastName;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
