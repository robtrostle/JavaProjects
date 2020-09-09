
package Chapter9;

/**
 *
 * @author robert.trostle
 */
public class AnimalDemoConstructor {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        AnimalClientConstructor cat = new AnimalClientConstructor();
        System.out.println(cat);
        
        System.out.println("");
        
        AnimalClientConstructor dog = new AnimalClientConstructor("Dog", "Randy", "Woof",4,6.4);
        
        dog.setName("Not Randy");
        System.out.println(dog);
        
        System.out.println("");
        
        AnimalClientConstructor cow = new AnimalClientConstructor("Cow");
        System.out.println(cow);
                
}
}
