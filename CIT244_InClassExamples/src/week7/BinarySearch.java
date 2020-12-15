/*
A binary search comes with the prerequisite that the data must be sorted. ... 
Just remember that sorting data, even with the most efficient algorithm, 
will always be slower than a linear search
*/
package Week8;
import java.util.Scanner;

public class BinarySearch {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Array must be in order
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Enter a number to search: ");
        int n = scan.nextInt();
        
        System.out.println(n + " found at pos " + binSearch(numbers, n));
        
    }
    
    public static int binSearch(int[] arr, int search)
    {
        int start = 0; // Start is 0th index
        int mid = 0; // We don't know the mid just yet
        int end = arr.length - 1;
        
        // While our start (or current) has not exceeded the end 
        while(start <= end)
        {
            // Find the midpoint ((START + END) / 2)
            mid = (start + end) / 2;
            
            // Print the current INDEX and ELEMENT of Start, End & Mid
            System.out.println("INDEX START = " + start + " END = " + end + " MID = " + mid);
             System.out.println("VALUES START = " + arr[start] + " END = " + arr[end] + " MID = " + arr[mid] +" \n");
            
            // If our value is in the middle, we found it! Otherwise keep looking
            if(arr[mid] == search)
            {
                return mid;
            }
            // If value in the current middle is > than what we want
            // the value must be to the left so .. we do not care about the right
            // Move our END to be -1 from where we are now
            else if(arr[mid] > search)
            {
                end = mid - 1;
            }
            // Same principle as above, but flipped now we will ignore the left
            // and set our new START to where we are (mid) + 1
            else if(arr[mid] < search)
            {
                start = mid + 1;
            }
        }
        // As soon as the start > end we exit the loop,
        // Otherwise we continue to search each time splitting the array in half
        // Eventually what we are looking for WILL be the MID
        
        // If we NEVER find the element, return -1
        return - 1;
    }
    
}