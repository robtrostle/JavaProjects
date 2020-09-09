
package Chapter13;

/**
 *
 * @author robtr
 */
public class AnimalDemo {

    
    public static void main(String[] args) {
        //Pig
        System.out.println("Pig:");
        Pig babe = new Pig();
        babe.sound();
        babe.eats();
        babe.rollInMud();
        //Farm animal methods
        babe.farmer();
        babe.printFarm();
        
        //Horse
        System.out.println("\nHorse:");
        Horse henry = new Horse();
        henry.sound();
        //We don't have to use both of the methods even though we are overriding them. 
        henry.sayHello();
        henry.swear();
    }
}
