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
public class Decision1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int age;
        
        System.out.println("Enter your age ");
        age = scan.nextInt();
        int diff;
        
        if (age >= 18) {
            
            System.out.println("You are old enough to vote! ");
            
        }
        
        else {
            
          diff = 18 - age;
            System.out.println("You can vote in " + diff + " years.");
        
        
        
    }
    
}}
