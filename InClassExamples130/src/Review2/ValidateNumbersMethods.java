/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review2;

import java.util.Scanner;


public class ValidateNumbersMethods {

    
    public static void main(String[] args) {
        
        //Lab Assignment 3 ditto
        
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        
        num1 = validateNum(scan, "first");//give it the tool to do its job. 
        num2 = validateNum(scan, "second");//for non void methods, assign a variable! 
        num3 = validateNum(scan, "third");

        System.out.print("The numbers are: "
                + num1 + ", " + num2 + ", " + num3);
    }
                                                    //promise a string too! 
                    //in order to return an int, you need a scanner and a string
    public static int validateNum(Scanner scan, String s){
        //because this method returns an int, it IS an int!!! Can only return one thing. 
          int num;
          do {
            System.out.print("Enter the " + s + " number: --> ");
            num = scan.nextInt();
        } while (num <= 0);
          
          return num;
    }//will always get this red line from a non void method. (missing return)
    
}
