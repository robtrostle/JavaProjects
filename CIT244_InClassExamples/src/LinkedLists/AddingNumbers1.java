
package LinkedLists;

import java.util.ArrayList;


public class AddingNumbers1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList numbers = new ArrayList();
        //Add numbers to AL
        numbers.add(10);
        numbers.add(5);
        //prove we added the numbers to the AL
        System.out.println(numbers);
        //try to add the numbers together
        //int sum = numbers.get(0) + numbers.get(1);Can't do this
        
         // We can however, do something like this .. but it is a bit too much
        String nsv0 = numbers.get(0).toString();
        int n0 = Integer.parseInt(nsv0);
        
        String nsv1 = numbers.get(1).toString();
        int n1 = Integer.parseInt(nsv1);
        
        int sum = n0 + n1;
        System.out.println("Sum = " + sum);
        
        
    }
    
}
