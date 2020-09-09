
package Chapter11;

/**
 *
 * @author robtr
 */
public class EatsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DogEats dog = new DogEats();
        
        dog.eat();
        dog.bark();
        System.out.println("");
        
        dog.eatNBark();
        
        
    }
    
}
