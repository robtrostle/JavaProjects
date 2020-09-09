/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtraReview;

import java.util.Scanner;


public class MethodsAsVariable {

    
    public static void main(String[] args) {
        // TODO code application logic here
        String text1, text2, text3;
        
        text1 = getText();
        text2 = getText();
        text3 = getText();
        System.out.println("The text values are: " + text1 + ", " + text2 + text3);
        double PI = getPi();
        System.out.println(PI);
        
    }
    public static String getText()
    {
        Scanner scan = new Scanner(System.in);
        String s;
        
        System.out.print("Enter text: ");
        s = scan.nextLine();
        
        return s;
    }   
    
    public static double getPi(){
        return 3.14;
    }
    
}
