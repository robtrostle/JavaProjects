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
public class LastLetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String name;
        char letter;
        
        System.out.print("Enter your name:  ");
        name = scan.next();
        
        letter = name.charAt(name.length() - 1);
        
        
        
        System.out.println("The last letter of " + name + " is " + letter);
        
        
    }
    
}
