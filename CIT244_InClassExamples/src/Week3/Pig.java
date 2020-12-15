
package Week3;


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
        System.out.println("Rolls in mud*");
    }
    @Override//Method from the FarmAnimal interface
    public void farmer(){
        System.out.println("MacDonald is the farmer.");
    }//since pig implements farmAnimal, it can access the variable farm
    public void printFarm(){
        System.out.println(farm);
    }
}
