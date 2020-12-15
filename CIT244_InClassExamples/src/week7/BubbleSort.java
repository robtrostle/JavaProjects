/*
 Program that implements the bubble sort algorithm O(n^2)
 Picture the bubbles of a glass of soda rising to the top
 It gets its name because with each round the largest unsorted object bubbles to the top

Bubble Sort is the simplest sorting algorithm that works by 
repeatedly swapping the adjacent elements (pairs) if they are in wrong order.

@@@@ = a println demonstration

4 2 1 3 START
2 4 1 3
2 1 4 3
2 1 3 4
1 2 3 4
1 2 3 4 DONE
 */
package Week7;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        
        int[] array =  {4, 2, 1, 3,7,9,8,13,11,96};
        
        System.out.println("The unsorted array: " + Arrays.toString(array));
        
        // Check if it worked
        bubbleSort(array);
        System.out.println("The SORTED array: " + Arrays.toString(array));
        
    }
    
    // Takes as a parameter the array we are to sort
    public static void bubbleSort(int[] arr)
    {
        // We need to know the length of the given array, so we know when to stop our loop
        int n = arr.length;
        // Temp variable to make the swaps 
        int temp;
        
        // 1.
        // Loop through the size of the array - 1 (Becuase we start at 0)
        for (int i = 0; i < n - 1; i++) 
        {
            // @@@@ Prints the current state of the array
            // System.out.println(Arrays.toString(arr));
            
            // 2. 
            // Enter a second for loop (nested) to compare the next element
            // to the iTH element, remember we comapre in pairs and swap as/when needed
            
            // while n - i - 1 (The 1 less than the length we've already looked through)
            // j resets to 0 each time, i does not
            //After the first round, we know that the largest number is where it needs to be
            //this is why we need j<n-i-1. Because it bubbled to the end. 
            //If you have to compare elements in the array, you'll need nested loop
            for (int j = 0; j < n - i - 1; j++) 
            {
                // @@@@ Print values of i and j
                // System.out.println("i = " + i + " j = " + j);
                
                // If our current element is larger than the one to the right of it
                if(arr[j] > arr[j + 1])
                {
                    // @@@@ State what number is bubbling up (Being swapped)
                    System.out.println("Bubble szsz " + Arrays.toString(arr));
                    System.out.println("Bubbline " + arr[j]);
                    
                    // 3. 
                    // Make the swap (Bubble it up) 
                    // Swap! Just like in swapping elements
                    // swap arr[j+1] and arr[i]
                    
                    // Store element j away safely
                    temp = arr[j];
                    // Replace the current j with the ele to the right
                    arr[j] = arr[j+1];
                    // Safely stored away temp now isnerted in j+1
                    arr[j+1] = temp;
                    
                }
            }
        }
        
    }
    
}