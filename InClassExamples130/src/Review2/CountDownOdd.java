/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review2;

/**
 *
 * @author robert.trostle
 */
public class CountDownOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //For loops take a starting point, test condition, increment/decrement
       //i stands for index. i is just a standard
       //test condition is kind of like a while loop. (while i <= 10), keep moving
      //for each iteration, do this! 
      //it won't exit the loop until i is greater than 10
      //if you are thinking in your head and say "if", you need an if statement
        for (int i = 10; i >= 1; i--) 
        if(i % 2 != 0){
            System.out.println(i);
        }
        
    }
    
}
