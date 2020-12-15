
package Week3;

/**
 *
 * @author robtr
 */

import java.util.Arrays;

public class ReverseArray {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] array = {1, 2, 3, 4, 5};
        
        // Print original Array
        System.out.println("Original Array");
        for(int i = 0; i < array.length; i++)
        {
            System.out.println("Index " + i + " contains value of " + array[i]);
        }
        
        // Code to reverse the Array
        int temp;//If you don't divide by 2, you will reverse the arrray twice. 
        for(int i = 0; i < array.length/2; i++)
        {
            // temp is assigned to iTH position of array
           temp = array[i];
           // array at position 1 is replaced with the last element (unchanged) in the array
           array[i] = array[array.length - i - 1];
           // put the temp variable in its new spot
           array[array.length - 1 - i] = temp;
           
           // Print array as we go to see
           System.out.println(Arrays.toString(array));
        } 

        // Print reversed Array
        System.out.println("\nReversed Array");
        for(int i = 0; i < array.length; i++)
        {
            System.out.println("Index " + i + " contains value of " + array[i]);
        }
        
        
    
    }
    
}
