
package Chapter9;

/**
 *
 * @author robert.trostle
 */
public class AnimalDemo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        AnimalClient frog = new AnimalClient();
        
        frog.setName("Gary");
        frog.setSound("ribbit");
        frog.setSpecies("Frog");
        frog.setAge(2);
        frog.setWeight(0.5);
        
        String name = frog.getName();
        String sound = frog.getSound();
        String species = frog.getSpecies();
        int age = frog.getAge();
        double weight = frog.getWeight();
        
        System.out.println(frog);
        
    }
    
}
