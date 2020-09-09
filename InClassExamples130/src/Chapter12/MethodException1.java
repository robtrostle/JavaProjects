
package Chapter12;

/**
 *
 * @author robtr
 */
public class MethodException1 {

    
    public static void main(String[] args) {
        
        checkAge(15);
        System.out.println("End of program");
        
    }
    
    public static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Not eligible for voting!");
        }
        else{
            System.out.println("Eligible for voting");
        }
    }
    
}
