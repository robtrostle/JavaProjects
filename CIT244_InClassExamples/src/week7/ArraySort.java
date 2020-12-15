
package week7;

import java.util.Arrays;


public class ArraySort {

    
    public static void main(String[] args) {
    
        
        int[] numbers = {2, 1, 3, 5, 4};
        System.out.println("BEFORE sort:");
        System.out.println(Arrays.toString(numbers));
        
        Arrays.sort(numbers);
        
        System.out.println("\nAFTER sort:");
        System.out.println(Arrays.toString(numbers));
        
        System.out.println("\n.. But what just happened? And how!? ..");      
        
        // This uses Quick Sort algorithm (Or Merge) Prim VS Obj
        // We will cover these 2 last 
        
    }
    
}