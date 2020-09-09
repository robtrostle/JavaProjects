
package ExtraReview;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Robert Trostle
 *  Exam 1 | question 1
 */
public class Exam1_TrostleRob1 {

    
    public static void main(String[] args) {
        // Create a double array of size 5
        double[] numArray = new double[5];
        Scanner scan = new Scanner(System.in);
        int evenCount = 0;
        //Using a for loop, prompt the user for 5 doubles.
        for (int i = 0; i < numArray.length; i++) {
            
            System.out.print("Enter a number to store in the array --> ");
            numArray[i] = scan.nextDouble();
            //see largest value excercise
        }
        //for each integer element in the array
        //Using an enhanced for loop, iterate through the array and keep track
        // of even numbers. 
        for(double e : numArray)
        {
            if(e % 2 == 0)
            {
        evenCount++;
    }
    
        } System.out.println("The array contains " + Arrays.toString(numArray));
            System.out.println(evenCount + " of these values are even");
    }
}