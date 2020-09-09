/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review1;

import java.util.Scanner;


public class NestingExample {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int response;
        
        System.out.println("Let's count to 2! \n If you input the wrong "
                + "sequence, I will stop.");
        
        System.out.println("Type the first sequence --> ");
        
        response = scan.nextInt();
        
        if(response == 1){
            System.out.println("Correct!");
            System.out.println("Try the next number -->");
            response = scan.nextInt();
                    
            if (response == 2) {
                System.out.println("Correct! You counted to 2!");
            }
            else {
                System.out.println("So close, yet so far. Program ending.");
            }
        }
        else{
            System.out.println("Wrong! Ending..");
        }
    }
    
}
