
package Chapter13;

/**
 *
 * @author robtr
 */
public class Pig implements Animal, FarmAnimal {
    
    @Override
    public void sound(){
        System.out.println("Oink Oink");
    }
    @Override
    public void eats(){
        System.out.println("Anything it can get its hands on");
    }
    public void rollInMud(){
        System.out.println("*Rolls in mud*");
    }
    //Method from the FarmAnimal interface
    @Override
    public void farmer(){
        System.out.println("MacDonald is the farmer");
    }
    public void printFarm(){
        System.out.println(farm);//got this from the FarmAnimal interface
    }
    
}
