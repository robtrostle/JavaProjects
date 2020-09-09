/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtraReview;

import java.util.Scanner;


public class RowsAndColumns {

   
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int rows;
        int cols;
        //row input
        do {
            System.out.print("Enter the number of rows: ");
            rows = scan.nextInt();
            
        } while(rows <= 0);
        //col input
         do {
            System.out.print("Enter the number of cols: ");
            cols = scan.nextInt();
            
        } while(cols <= 0);
         //Print matrix
         for(int r = 0; r < rows; r++)
         {
             for (int c = 0; c < cols; c++) 
             {
                 Thread.sleep(2000);
                 System.out.print("'.'");
             }
             System.out.println();
         }
        
        
       
        
    }
    
}
