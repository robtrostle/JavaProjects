/*
Notice the difference in output 
Insertion does much less when determiend it is already sorted)
 */
package Week7;

import java.util.Arrays;

public class InsertionVSSelection {

    public static void main(String[] args) {

        int[] array = {64, 25, 12, 22, 11};

        System.out.println("SELECTION SORT:");
        selectionSort(array);
        
        System.out.println("\n***********************************************\n");
        
        array[0] = 64;
        array[1] = 25;
        array[2] = 12;
        array[3] = 22;
        array[4] = 11;
        System.out.println("INSERTION SORT:");
        insertionSort(array);
    }

    public static int[] selectionSort(int[] arr) 
    {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) 
            {
                System.out.println("\nBack to the start!");
                if (arr[j] < arr[min])
                {
                    min = j;
                    System.out.println("New min at index " + j);
                }
                System.out.println("Settled on index " + j + " as the min to actually swap.");
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }

    public static int[] insertionSort(int arr[]) 
    {
        int n = arr.length;
        int key, j;

        for (int i = 1; i < n; i++) 
        {
            System.out.println("\nBack at the start!");

            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;

                System.out.println("'j' being shifted " + Arrays.toString(arr));
            }
            System.out.println("Exit the inner while loop");

            arr[j + 1] = key;

            System.out.println("'i' being shifted " + Arrays.toString(arr));
        }

        return arr;
    }

}
