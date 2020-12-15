/*
Selection sort is a sorting algorithm in which we repeatedly find the smallest
element and place it in its final placement the first time around (opposed to bubble sort)

We swap the same way as bubble (using a temp variable) but we do not go through with 
that swap until we have checked all elements in the array, not just the one to the right of us. 
This way when we loop through again, we can start from i+1 because i is already known to be sorted.

65, 25, 12, 22, 11 START
11, 25, 12, 22, 64
11, 12, 25, 22, 64
11, 12, 22, 25, 64
11, 12, 22, 25, 64 DONE

// Smallest value always gets placed in correct spot first
*/
package Week7;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        
        int[] array = {64, 25, 12, 22, 11};
        System.out.println(Arrays.toString(array));
        
        int[] sortedArray = selectionSort(array);
        System.out.println(Arrays.toString(sortedArray));
        
    }
    
    public static int[] selectionSort(int[] arr)
    {
        // Size the array
        int n = arr.length;
        
        // Loop through the array
        for (int i = 0; i < n - 1; i++) 
        {
            // @@@@ Show we are entering the loop again
            System.out.println("Back to the start (outer loop)");
            
            // Assign the smallest value to whatever is at index i (0 to start)
            int min = i;
            
            // Nested for starts at the number to the right> of i (to compare)
            for (int j = i+1; j < n; j++) 
            {
                // Compare values
                if(arr[j] < arr[min])
                {
                    // 25 < 64 or (j < min) YES, but we do not swap yet
                    // instead, continue through the j loop and hold index of
                    // of our smallest value j in the min variable
                    min = j;
                    
                    // @@@@  Show new min found
                    System.out.println("New min at index " + j + " = " + arr[j]);
                }
            }
            // Outside of nested for | Print the OVERALL min this time around
            System.out.println("Settled on index " + min + 
                    "(" + arr[min] + ") as the min to actually swap");
            
            // Swap (Refer back to swappingelements.java)
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            
            // @@@@ Print the current state of the array
            System.out.println(Arrays.toString(arr));
            
        }
        
        // Once we exit both loops return the sroted array
        return arr;
    }
    
}