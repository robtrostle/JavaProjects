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
public class YesToRepeat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text;
        String repeat = "yes";//yes will be the sentinal value
        //the loop is forced through once since repeat is yes. 
        while(repeat.equalsIgnoreCase("YeS")){
        System.out.print("Enter some text:  ");
        text = scan.next();
        
       
        System.out.println(text);
        
        scan.nextLine(); //this is clearing the buffer. It jumps down to the next line
        //jumps down. hello is still there but it's not in the way anymore. 
        
        System.out.print("Enter \"YES\" to play again: ");
        repeat = scan.nextLine();
        //what is the next thing you should see? the loop should start there
        //hello gets stored in the buffer. But the hello is stuck inside the buffer. 
        //this is when you have scan.nextLine(). Next will search for the next word of a blank space. 
        //
        }
        
        
    }
    
}
