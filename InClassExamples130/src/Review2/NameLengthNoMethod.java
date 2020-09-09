/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review2;

import java.util.Scanner;


public class NameLengthNoMethod {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        String name;
        int nameLength;
        
        System.out.print("Enter your name --> ");
        name = scan.next();
        
        nameLength = name.length();
        
        System.out.println(name + " has " + nameLength + " characters.");
       
    }
    
}
