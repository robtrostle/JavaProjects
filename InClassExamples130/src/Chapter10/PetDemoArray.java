
package Chapter10;

/**
 *
 * @author robert.trostle
 */
public class PetDemoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //int[] numArray = new int[3];
        
        Pet[] petArray = new Pet[5];
        petArray[0] = new Pet("Tony", 12, 15.0);
        petArray[1] = new Pet("Tink");
        petArray[2] = new Pet(2);
        petArray[3] = new Pet(12.1);
        petArray[4] = new Pet();
        
        for (Pet pet : petArray) {
            System.out.println(pet);
        }
    }
    
}
