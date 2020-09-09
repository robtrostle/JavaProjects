/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtraReview;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Robert Trostle
 * Practice Exam 1 | question 1
 */
public class PracticeExam1 {

    
    public static void main(String[] args) {
        // Create an integer array of size 5
        int[] numArray = new int[5];
        Scanner scan = new Scanner(System.in);
        int largeCount = 0;
        
        for (int i = 0; i < numArray.length; i++) {
            
            System.out.print("Enter a number to store in the array --> ");
            numArray[i] = scan.nextInt();
            //see largest value excercise
        }
        //for each integer element in the array
        for(int e : numArray)
        {
            if(e > 100)
            {
        largeCount++;
    }
    
        } System.out.println("The array contains " + Arrays.toString(numArray));
            System.out.println(largeCount + " of these values are larger than 100");
    }
}