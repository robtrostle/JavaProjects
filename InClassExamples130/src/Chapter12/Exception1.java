/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

import java.util.Scanner;

/**
 *
 * @author robtr
 */
public class Exception1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int n1, n2, div;
        
        System.out.print("Enter the first number: ");
        n1 = scan.nextInt();
        
        System.out.print("Enter the second number: ");
        n2 = scan.nextInt();
        
        div = n1/n2;
        
        System.out.println("The quotient is: " + div);
        
        
    }
    
}
