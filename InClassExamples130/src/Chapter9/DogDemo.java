
package Chapter9;

import Chapter9.DogClient;

public class DogDemo {

    public static void main(String[] args) {
        
        // Create 3 dogs based on the DogClient Class 
        // Instead of 3 dogs with multiple variables which do the same thing
        
        // Dog1
        DogClient dog1 = new DogClient("SomeName", "SomeBreed", "Tan/White", 1, false);

        // Dog2
        DogClient dog2 = new DogClient("Some Other Name", "Some Breed", "Tan/Brown", 4, true);
        
        // Dog3
        DogClient dog3 = new DogClient("Yet Another Name", "Some Other Breed", "White/Gray", 6, true);
        
        
        // Print dogs
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());
        
        
        // Create a "deafult Dog"
        DogClient dog4 = new DogClient();
        System.out.println(dog4.toString());
        
        
    }
    
}
