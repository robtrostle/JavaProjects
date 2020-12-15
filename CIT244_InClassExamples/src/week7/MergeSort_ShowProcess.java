/*
Merge sort is a divide and conquer algoritihm
It contiously splits the array into halfs again
and again until they are individual elements (using recursion) 
Then it sorts set of elements and gradually pieces the array back together
 */
package Week7;

import java.util.Arrays;

public class MergeSort_ShowProcess {

    public static void main(String[] args) {
        
        int[] array = {5, 4, 3, 2, 1};
        System.out.println("Unsorted: " + Arrays.toString(array));
        
        array = mergeSort(array);
        System.out.println("\nSorted: " + Arrays.toString(array));
        
    }
    
    // (DIVIDE)
    public static int[] mergeSort(int[] arr)
    {
        // Base case (when to stop recursive call)
        if(arr.length <= 1)
        {
            return arr;
        }
        
        // Find the middle of the arr and split it into left and right sections 
        // i.e. 5 / 2 = 2
        int mid = arr.length / 2;
        
        // Left array is half the size of the array
        int[] left = new int[mid];
        
        // Right array is length - mind (Incase we run into an uneven array)
        // i.e. 5 / 2 = 2 on each side (What we want is [2] and [3])
        int[] right = new int[arr.length - mid];
        
        // Populate each array
        // (L)
        for (int i = 0; i < left.length; i++) 
        {
            left[i] = arr[i];
        }
        
        // (R)
        for (int j = 0; j < right.length; j++) 
        {
            // mid + j ensures we start filling (R) with values that are AFTER
            // the mid, otherwise we clone (L)
            right[j] = arr[mid + j];
        }
        
        // Print our LEFT and RIGHT arrays current contents
        // View this carefully and notice how we print L then R BUT
        // then L is split into L R segments, finally we do right
        // At this point we have many size 1 arrays
        System.out.println("LEFT ARRAY: " + Arrays.toString(left));
        System.out.println("RIGHT ARRAY: " + Arrays.toString(right));
        
        // What will be the finished array
        int[] result = new int[arr.length];
        
        left = mergeSort(left);
        right = mergeSort(right);
        
        // end our result
        result = merge(left, right);
        System.out.println("Current state (After MERGE): " + Arrays.toString(result));
        
        // We have it!
        return result;
    }
    
    // Merges the Left & Right arrays together (CONQUER)
    public static int[] merge(int[] left, int[] right)
    {
        // Result array the size of the original array (our splits combined)
        int[] result = new int[left.length + right.length];
        
        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;
        
        // While there are elements in either the L OR R array, we merge
        // (Ensures we have somethign to merge) | once we hit length we finished merging that particualr array
        while(leftPointer < left.length || rightPointer < right.length)
        {
           // If there are elements in the left AND the right 
           if(leftPointer < left.length && rightPointer < right.length)
           {
               // NESTED IF: both L & R have elements them we compare L & R
               // If element left < right
               if(left[leftPointer] < right[rightPointer])
               {
                   // Then the result pointer current ele will be left (smallest of the two)
                   result[resultPointer] = left[leftPointer];
                   resultPointer++;
                   leftPointer++;
               }
               else 
               {
                   // If we're here then right < left
                   result[resultPointer] = right[rightPointer];
                   resultPointer++;
                   rightPointer++;
               }
           }
           // If there are ONLY elemnts in the LEFT array
           // Because it starts at - and will go up to the length of the array as we add eles
           else if(leftPointer < left.length)
           {
               result[resultPointer] = left[leftPointer];
               resultPointer++;
               leftPointer++;
           }
           // If there are ONLY elements in the RIGHT array
           else if(rightPointer < right.length)
           {
              result[resultPointer] = right[rightPointer];
              resultPointer++;
              rightPointer++;  
           }
        }
        
        // Return the finished array
        return result;
    }
    
}