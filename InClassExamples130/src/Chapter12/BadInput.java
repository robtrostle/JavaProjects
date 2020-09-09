
package Chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;


public class BadInput {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n;
        boolean isInt = false;
        
      do{
       try{
         do{
            System.out.print("Enter a positive integer --> ");
            n=scan.nextInt();
            
        }while(n <= 0);
        
        isInt = true; //If yuo make it through that loop, you're an int. 
        
        System.out.println(n + " is positive");
        }
        catch(InputMismatchException ex){
            
            System.out.println("I said INTEGER!");
            scan.nextLine();//Clear the buffer, erasing what user typed in. 
        }
        }while(!isInt); //Do all this while it is NOT an integer. 
    }
    
}
