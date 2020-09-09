
package ExtraReview;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Robert Trostle
 * Practice Exam 1 | question 2
 */
public class PracticeExam2 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Create an integer array of size 5
        int[] numArray = loadArray(scan);
        
        int largeCount = countLarge(numArray);
        
        
       System.out.println("The array contains " + Arrays.toString(numArray));
            System.out.println(largeCount + " of these values are larger than 100");
    } public static int[] loadArray(Scanner sc){
        int[] Arr = new int[5];
        
        for (int i = 0; i < Arr.length; i++) {
            
            System.out.print("Enter a number to store in the array --> ");
            Arr[i] = sc.nextInt();
            //see largest value excercise
            
        }return Arr;
        
    } public static int countLarge(int[] a){
        int lc = 0;
        
        for(int e : a)
        {
            if(e > 100)
            {
        lc++;
    }
            
    }
        return lc;
}
}