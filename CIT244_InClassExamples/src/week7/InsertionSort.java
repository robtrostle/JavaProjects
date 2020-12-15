/*
Much like selection sort but ...
While selection sort must scan the remaining parts of the array when placing an element, 
insertion sort only scans as many elements as necessary.

This is demonstrated by the condition of the while loop
IF j < 0 OR arr[j] < key, we know we're done (Everything is sorted)
. Whereas in the selection sort we always comapre to the right even if it is already sorted.

i.e [1, 2, 3, 4, 5] (See Example) InsertionVSSelection
 */
package Week7;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        
        int[] array = {64, 25, 12, 22, 11};
        System.out.println(Arrays.toString(array)); 
        
        int[] sortedArray = insertionSort(array);
        System.out.println(Arrays.toString(array));
        
    }
    
    public static int[] insertionSort(int[] arr)
    {
        int n = arr.length;
        int key, j;
        
        // Loop through the array starting at index 1
        // Becuase we comapre to the left, and there is nothing to left of 0
        for (int i = 1; i < n; i++) 
        {
            // @@@@ Show we are back at the start
            System.out.println("\nBack at the start!");
            
            // Our current pos in the array (i) is refered as the "key"
            // Here first time around our key would be 25
            key = arr[i];
            
            // j is the element to the LEFT of our current index (or key)
            // Here j would be 0 because i = 1 and i - 1 = 0 (64)
            j = i - 1;
            
            // Nested while loop to perform the swaps
            // while j >= 0 AND the value of the jTH ele is > than key (ith) ele
            while(j >= 0 && arr[j] > key)
            {
                System.out.println("aaaaaaa");
                // Store the ele to our left (j) to our right (Bubble up)
                arr[j + 1] = arr[j];
                
                // Reset j to the index to the left of where we are now
                j = j - 1; // First time around, j becomes -1 (to break the loop)
                
                // We are stuck inside of this loop until !j>= 0 && arr[j] > key
                // @@@@ Print j being shifted
                //System.out.println("j being shifted" + Arrays.toString(arr));
            }
            // @@@@ Show we escape the nested while
            System.out.println("Exit the inner while loop ..");
            
            // Assign j + 1 to our new starting point for the next time around the loop
            // because everythign to the left is already sorted! 
            arr[j + 1] = key;
            
            // @@@@ Show that the iTH ele is palced to the jTH index
            System.out.println("i being shifted " + Arrays.toString(arr));
            
        }
        
        return arr;
    }
    
}