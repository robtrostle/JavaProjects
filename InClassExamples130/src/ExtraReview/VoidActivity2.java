/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtraReview;

import java.util.Scanner;


public class VoidActivity2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int num;
        
        System.out.println("Enter a number and i'll count up to it: ");
        num = scan.nextInt();
        
        countUp(num);
        

    }
    public static void countUp(int n)
    {                       //if you have the type of variable that is broken in your
        //arg, change look what you have. If you don't have, create it locally. 
        for (int i = 1; i <= n; i++) 
        {
            System.out.println(i);
        }
    }
    
}
