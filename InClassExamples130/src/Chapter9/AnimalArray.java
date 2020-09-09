/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

/**
 *
 * @author robert.trostle
 */
public class AnimalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // an array is an object
        int[] numArray = new int[3];
        AnimalClientConstructor[] animalArray = new AnimalClientConstructor[3];
        
        animalArray[0] =  new AnimalClientConstructor("Cow", "someName", "Moo", 5, 200);
        animalArray[1] =  new AnimalClientConstructor("Dog", "Randy", "Woof", 4, 6.4);
        animalArray[2] =  new AnimalClientConstructor("Cat", "Sandy", "Meow", 1, 4.1);
        
        for (int i = 0; i < animalArray.length; i++) {
            System.out.println(animalArray[i]);
        }
        
        for(AnimalClientConstructor animal : animalArray){
            System.out.println(animal);
        }
        
        
        
        
        
        
    }
    
}
