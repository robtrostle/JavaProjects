/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review2;

import java.util.Scanner;

/**
 *
 * @author robert.trostle
 */
public class ValidationDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Validation is referring to using a do while loop. 
        
        Scanner scan = new Scanner(System.in);
        int num;//sentinal value WE DON'T NEED a Sentinal value here for do loops. 
        
        //System.out.print("Enter a positive number:  ");
        //num = scan.nextInt();
        
        do//do the code and then check to see if you do it again. 
            //you get a chance to initialize the value
            //it will always run at least one time. 
        {
            System.out.print("Enter a positive number:  ");
            num = scan.nextInt();
        }while(num < 0);
        
        System.out.println(num + " is valid");
        //we keep looping until the bad input is true
        //if you have good input, your done. No reason to loop good input! 
        //think of what the loop should be and do the opposite! 
        //-1 is bad input. 
    }
    
}
