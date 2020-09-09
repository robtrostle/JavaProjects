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
public class PrintArray3 {

    
    public static void main(String[] args) {
        
        //make an integer array which has a size of 3
        //an array is an object so you have to say new 
        int[] numArray = {1,2,3};
        
           // using a for loop to print the array
           // i stands for index!!! 
           
           //print array using an enhanced for loop
           //for each int element inside of numArray, do this.  if it was a double, you could say double e. 
           //starts at the beginning and goes to the end. 
           //for loop has more control. Referencing the index and stuff. //fore + tab to do a shortcut 
           for (int e : numArray) 
           {
               System.out.print(e + ",");
           }
           
           for (int i : numArray) {
            
        }
            
        }
           
           
           
    
        
    }
    

