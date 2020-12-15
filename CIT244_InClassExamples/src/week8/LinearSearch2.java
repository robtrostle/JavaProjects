/*
Linear search is a sequential algorithim 
Perhaps the simplest of ALL searching algorithims but also the least effecient
*/
package Week8;

import java.util.Arrays;

public class LinearSearch2 {

    public static void main(String[] args) {
        
        // Simple example
        int[] array1 = RandomUnsortedArray2.numbers(1000000, 10);
        //System.out.println(Arrays.toString(array1));
        // We are searching for this number 
        int lookingFor = 9;
        
        // pos = position of the found element
        int pos = linearSearch(array1, lookingFor);
        
       
        displayFound(pos, lookingFor);
    }
    
    // Array to search & x is our value to find
    public static int linearSearch(int[] arr, int x)
    {
       int n = arr.length; 
       
        for (int i = 0; i < n; i++) 
        {
           if(arr[i] == x) 
           {
               return i;
           }
        }
        
        // Otherwise we return -1 (As failed, or not found)
        return - 1;
    }
    
    public static void displayFound(int p, int lf)
    {
         // -1 means not found, otherwise found at position pos
        if(p == -1)
        {
            System.out.println(lf + " was not found in the array.");
        }
        else 
        {
            System.out.println(lf + " was found at index " + p);
        }
    }
    
}
