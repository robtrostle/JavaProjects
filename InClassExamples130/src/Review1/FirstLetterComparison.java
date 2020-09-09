/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review1;

import java.util.Scanner;

/**
 *
 * @author robert.trostle
 */
public class FirstLetterComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        char letter1, letter2;
        String input, inputUpper;
        
        System.out.print("Enter some text:  ");
        input = scan.next().toUpperCase();
        //inputUpper = input.toUpperCase();
        letter1 = input.charAt(0);
        //or letter1 = scan.next().toUpperCase().charAt(0);
        
        //letter1 = scan.next().charAt(0);
        //input already served its purpose upstairs to it can be reused. 
        System.out.print("Enter some more text:  ");
        input = scan.next().toUpperCase();
        letter2 = input.charAt(0);
        //or letter1 = scan.next().toUpperCase().charAt(0);
        
        if(letter1 == letter2){
            System.out.println(letter1 + " and " + letter2 + " are the same");
        }
        else{
            System.out.println("Different starting characters. ");
        }
    }
    
}
