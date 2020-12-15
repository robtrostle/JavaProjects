
package Week3;

/**
 *
 * @author robtr
 */
public class Car extends Vehicle {
    
    int maxSpeed = 120;
    
    public void displaySpeed(){
        System.out.println("The car (child) has a maxspeed of " + maxSpeed);
        System.out.println("The vehicle (parent) has a maxspeed of " 
                + super.maxSpeed);
        
    }
    
}
