
package Week3;

import java.util.Arrays;

/**
 *
 * @author robtr
 */
public class ReverseArrayMethod {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {1, 2, 3, 4, 5};
        
        // Print original Array
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(array));
        
        int[] reversedArray = reverseArray(array);
        
        System.out.println("\nReversed Array:");
        System.out.println(Arrays.toString(reversedArray));
        System.out.println("\nOriginal Array:");
        System.out.println(Arrays.toString(array));
        
    }
    
    public static int[] reverseArray(int[] arr) {
        
        int size = arr.length;
        int[] revArr = new int[size];
        
        for(int i = 0; i < revArr.length; i++) {
            revArr[i] = arr[size - i - 1];
        }
        
        return revArr;

    }
    
}
