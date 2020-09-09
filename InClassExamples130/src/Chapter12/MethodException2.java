
package Chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author robtr
 */
public class MethodException2 {

    
    public static void main(String[] args) {
        
        checkAge();
        System.out.println("End of program");
        //We will never get to "end of program" because we threw that exception which
        //caused the program to crash. 
    }
    
    public static void checkAge()//tells the program that the method could possible throw these exceptions. 
            throws ArithmeticException, InputMismatchException{
        //these are "checked" exceptions. 
        Scanner scan = new Scanner(System.in);
        int age;
        
        try{
            System.out.print("Enter an age: ");
            age = scan.nextInt();
        }
        catch(InputMismatchException ex){
            throw new InputMismatchException("Not an integer");     
        }
        
        if(age<18){
            
            throw new ArithmeticException("Not eligible for voting!");//This will crash it
        }
        else{
            
            System.out.println("Eligible for voting");
            
        }
    }
    
}
