/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

import java.util.Arrays;

/**
 *
 * @author robert.trostle
 */
public class ArrayClassMethods {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] array = {34, 55, 123, 999, 0, -4, 34};
        
        System.out.println("Print array as a String: ");
        System.out.println(Arrays.toString(array));
        
        System.out.println("\nSort the array");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        
        System.out.println("Binary Search");
        System.out.println("Number found at position: "
                + Arrays.binarySearch(array, 999));
        
        //use a for loop if you don't want to lose your data type
       
    }
    
}
