
package ExtraReview;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Robert Trostle
 *  Exam 1 | question 2
 */
public class Exam1_TrostleRob2 {

        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Call loadArray method
        double[] numArray = loadArray(scan);
        //Call countEven method
        int evenCount = countEven(numArray);
        
        //Print results
       System.out.println("The array contains " + Arrays.toString(numArray));
            System.out.println(evenCount + " of these values are even");
    
    }//Create a double array method that takes a scanner as an argument and
        //returns a double array. 
    public static double[] loadArray(Scanner sc){
        double[] Arr = new double[5];
        
        for (int i = 0; i < Arr.length; i++) {
            
            System.out.print("Enter a number to store in the array --> ");
            Arr[i] = sc.nextDouble();
            
        }return Arr;
    //Create an int method that takes a double array as an arg and returns an int. 
    } public static int countEven(double[] a){
        int ec = 0;
        //use an enhanced for loop to keep track of even numbers.
        for(double e : a)
        {
            if(e % 2 == 0)
            {
        ec++;
            }       
            //Return the count of even numbers
        } return ec;

}}