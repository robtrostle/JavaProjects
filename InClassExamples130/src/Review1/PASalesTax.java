/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author robert.trostle
 */
public class PASalesTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare variables
        
        DecimalFormat df = new DecimalFormat("$#,###,###.00");
        Scanner scan = new Scanner(System.in);
        double price;
        int quantity;
        double total;
        final double tax = 0.07;
        
        System.out.print("What is the price of your item? --> ");
        price = scan.nextDouble();
        
        System.out.print("How many items are you purchasing? --> ");
        quantity = scan.nextInt();
        
        total = ((price + (price * tax)) * quantity);
        
        System.out.println("\nThe total cost is " + df.format(total));
        
        
        
        
        
        
       
        
        
    }
    
}
