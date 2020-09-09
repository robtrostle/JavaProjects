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
public class ArrayExample4 {

    
    public static void main(String[] args) {
        
        //make an integer array which has a size of 3
        //an array is an object so you have to say new 
        int[] numArray = new int[3];
        
        numArray[0] = 1;
        numArray[1] = 2;
        numArray[2] = 3;
        
        System.out.println("The numbers are " + numArray[0]
        + ", " + numArray[1] + ", " + numArray[2]);
        
    }
    
}
