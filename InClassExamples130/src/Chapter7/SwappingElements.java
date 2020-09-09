/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;


public class SwappingElements {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] array = new int[4];
        
        array[0] = 6;
        array[1] = 5;
        array[2] = 2;
        array[3] = 9;
        
        int temp;
        
        System.out.println("Original Array");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + " contains value " + array[i]);
        }
        
        //swapping the elements of the array
        //store the 0th element inside of temp. 
        temp = array[0];
        //Move the 3rd index to the 0th
        array[0] = array[3];
        array[3] = temp;
        
        System.out.println("Swapped Array");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + " contains value " + array[i]);
        }
        
    }
    
}
