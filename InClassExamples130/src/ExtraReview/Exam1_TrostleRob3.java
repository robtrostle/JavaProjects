
package ExtraReview;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Robert Trostle
 *  Exam 1 | question 3
 */
public class Exam1_TrostleRob3 {

        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Call loadArray method
        double[] numArray = loadArray(scan);
        //Call countEven method
        int evenCount = countEven(numArray);
        //Call getEvenArray method
        double[] evenArray = getEvenArray(numArray,evenCount);
        
        //Print results
       System.out.println("\nThe array contains " + Arrays.toString(numArray));
       System.out.println(evenCount + " of these values are even\n");
       System.out.println("The even array contains " + Arrays.toString(evenArray));
         
    
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
    }
    public static double[] getEvenArray(double[] arr, int eCount){
        double[] evenArr = new double[eCount];
        int evenPos = 0;
        //loop over the array, filling even array with even values. 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                
                evenArr[evenPos] = arr[i];//keeps track of the position of the even number
                evenPos++;
        }
        
    }return evenArr;
}
}