/*
Linear search is a sequential algorithim 
Perhaps the simplest of ALL searching algorithims but also the least effecient
*/
package Week8;

public class LinearSearch {

    public static void main(String[] args) {
        
        // Simple example
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // We are searching for this number 
        int lookingFor = 9;
        
        // pos = position of the found element
        int pos = linearSearch(array1, lookingFor);
        
        // -1 means not found, otherwise found at position pos
        if(pos == -1)
        {
            System.out.println(lookingFor + " was not found in the array.");
        }
        else 
        {
            System.out.println(lookingFor + " was found at index " + pos);
        }
        
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
    
}