/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review2;

import java.util.Scanner;


public class ValidateNumbersNoMethods {

    
    public static void main(String[] args) {
        
        //Lab Assignment 3 ditto
        
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        
        //Validate num1 is positive
        do {
            System.out.println("Enter the first number: -->");
            num1 = scan.nextInt();
        } while (num1 <= 0);
        
        //Validate num2 is positive
        do {
            System.out.println("Enter the second number: -->");
            num2 = scan.nextInt();
        } while (num2 <= 0);
        
        //Validate num3 is positive
        do {
            System.out.println("Enter the third number: -->");
            num3 = scan.nextInt();
        } while (num3 <= 0);
        
        System.out.println("The numbers are: "
                + num1 + ", " + num2 + ", " + num3);
        
        
    }
    
}
