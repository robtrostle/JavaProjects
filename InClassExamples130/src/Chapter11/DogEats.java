
package Chapter11;

/**
 *
 * @author robtr
 */
public class DogEats extends AnimalEats{
    
    @Override
    public void eat(){
        System.out.println("Eating dog food...");
    }
    
    public void bark(){
        System.out.println("Barking.");
    }
    
    public void eatNBark(){
        bark();
        super.eat();
    }
    
}
