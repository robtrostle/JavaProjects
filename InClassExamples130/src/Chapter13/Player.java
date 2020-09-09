
package Chapter13;

/**
 *
 * @author robtr
 */
public class Player extends GameObject {
    
    @Override
    public void draw(){
        System.out.println("Drawing player...");
    }
    
    public void attack(){
        System.out.println("Attacking");
    }
}
