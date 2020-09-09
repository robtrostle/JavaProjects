/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;


import java.util.*;

/**
 *
 * @author robtr
 */
public class NotANumber1 {

    
    public static void main(String[] args) {
               
        Scanner scan = new Scanner(System.in);
        double number;
        
        try{
        System.out.print("Enter a NUMBER: ");
        number = scan.nextDouble();
        
        System.out.println("Your number is " + number);
        }
        catch(InputMismatchException ex){
            System.out.println("That was not a number. But I did not crash. ");
        }
    }
    
}
