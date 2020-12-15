
package Week3;

/**
 *
 * @author robtr
 */
public class Dog extends AnimalEats {
    
    @Override
    public void eat(){
        System.out.println("Eating dog food...");
    }
    public void bark(){
        System.out.println("Barking...");
    }
    public void eatNBark(){
        bark();
        super.eat();
    }
    
}
