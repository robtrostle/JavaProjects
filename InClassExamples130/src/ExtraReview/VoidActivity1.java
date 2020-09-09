/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtraReview;

import java.util.Scanner;

/**
 *
 * @author robert.trostle
 */
public class VoidActivity1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int num;
        
        System.out.println("Enter a number and i'll count up to it: ");
        num = scan.nextInt();
        
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
            
        }
        
        
    }
    
}
