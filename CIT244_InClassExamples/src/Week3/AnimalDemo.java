
package Week3;


public class AnimalDemo {

    
    public static void main(String[] args) {
        
        System.out.println("Pig:");
        Pig babe = new Pig();
        babe.sound();
        babe.eats();
        babe.rollInMud();
        //Farm Animal Methods
        babe.farmer();
        babe.printFarm();
        
        //horse
        System.out.println("\nHorse:");
        Horse henry = new Horse();
        henry.sound();
        //you don't have to use both methods just implement them all
        henry.sayHello();
        henry.swear();
        //can only inherit from one class. Horse inherited from talking 
        //animal. 
        
    }
    
}
