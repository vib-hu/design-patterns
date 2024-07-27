package behavioral.templatemethod;

import java.util.ArrayList;

public class Client {

    public void test(){
        Employee employee3 = new Employee(3);
        Employee employee2 = new Employee(2);
        Employee employee1 = new Employee(1);
        Employee[] arr = new Employee[3];
        arr[0] = employee3;
        arr[1] = employee2;
        arr[2]= employee1;

        Sort sort = new Sort();
        sort.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(((Employee)arr[i]).getId());
        }
    }
}
