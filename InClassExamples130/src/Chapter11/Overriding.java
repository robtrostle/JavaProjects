
package Chapter11;

/**
 *
 * @author robtr
 */
public class Overriding extends Overloading{
    
    @Override
    public void doSomething(String s){
        System.out.println("Can you see that I am overriding.");
        System.out.println("The String passed is: " + s);
    }
    
}
