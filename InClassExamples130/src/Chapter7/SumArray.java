/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

/**
 *
 * @author robert.trostle
 */
public class SumArray {

    
    public static void main(String[] args) {
        // get the sum of all the elements in the array
        int[] numArray = {100, 10, 20, 500, 999, 1};
        int sum = 0;
        
        for (int i = 0; i < numArray.length; i++) {
            //Add each element of the array to the value of sum
            sum += numArray[i];
            
            
        }
        System.out.println("The sum of the values in the array "
                + "is: " + sum);
    }
    
}
