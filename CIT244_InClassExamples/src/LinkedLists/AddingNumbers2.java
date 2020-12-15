package LinkedLists;

import java.util.ArrayList;

public class AddingNumbers2 {

    public static void main(String[] args) {
        //using the diamond operator, we can now make them ints. 
        ArrayList<Integer> numbers = new ArrayList();
        
        // Add numbers to AL
        numbers.add(10);
        numbers.add(5);
        
        // Prove we added the numbers to the AL
        System.out.println(numbers);
        
        // Try to add the two numbers together
        int sum = numbers.get(0) + numbers.get(1);
        // We can do this because, we have now stated that we are creating an arraylist
        // of type Integer, although Integer is wrapped object int when access the element
        // they unwrap back to primitive
        System.out.println("Sum = " + sum); 
        
    }
    
}