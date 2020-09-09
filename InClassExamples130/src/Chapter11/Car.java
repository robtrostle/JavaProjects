
package Chapter11;

/**
 *
 * @author child of vehicle
 */
public class Car extends Vehicle {
    
    int maxSpeed = 120;//
    
    public void displaySpeed(){
        System.out.println("The car (child) has a max speed of " + maxSpeed);
        System.out.println("The vehicle (parent) has a max speed of " 
        + super.maxSpeed);
    }
    
}
