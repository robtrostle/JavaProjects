/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;


public class LargestValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        int[] numArray = {100, 10, 20, 500, 999, 1};
        int largest = numArray[0];
        //i for index
        for (int i = 0; i < numArray.length; i++) 
        {
            if (numArray[i] > largest) 
            {
                largest = numArray[i];
                System.out.println("New largest value found at postion " + i);
            }
        } System.out.println("The largest value in the array is " + largest);
    }
        
    
}
