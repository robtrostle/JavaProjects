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
public class PrintArray2 {

    
    public static void main(String[] args) {
        
        //make an integer array which has a size of 3
        //an array is an object so you have to say new 
        int[] numArray = {1,2,3};
        
           // using a for loop to print the array
           // i stands for index!!! 
           for (int i = 0; i < numArray.length; i++) 
           {
               System.out.println("Index " + i + " contains the value "
               + numArray[i]);
           }
           
           
           
    
        
    }
    
}
