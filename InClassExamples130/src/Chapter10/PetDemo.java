
package Chapter10;

import java.util.Scanner;

/**
 *
 * @author robert.trostle
 */
public class PetDemo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Pet p = new Pet("Sam");
        System.out.println(p);
        
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        double weight;
        System.out.print("Updating pet record: ");
        
        System.out.print("Enter the pet's new name --> ");
        name = scan.nextLine();
        
        System.out.print("Enter the pet's new age --> ");
        age = scan.nextInt();
        
        System.out.print("Enter the pet's new weight --> ");
        weight = scan.nextDouble();
               
        p = new Pet(name, age, weight);
        
        System.out.println(p);
                
    }
    
}
