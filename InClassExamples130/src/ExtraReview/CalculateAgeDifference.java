/*
Calc the difference in ages

 */
package ExtraReview;

import java.util.Scanner;


public class CalculateAgeDifference {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int age1,age2,diff;
        
        do{
        System.out.print("Enter your age: ");
        age1 = scan.nextInt();
        }while(age1 <= 0);
        
        do{
        System.out.print("Enter your age: ");
        age2 = scan.nextInt();
        }while(age2 <= 0);
        
        if(age1 >= age2){
            diff = age1 - age2;
        }
        else {
            diff = age2 - age1;
        }
        System.out.println("The difference in age is " + diff + " year(s).");
        
    }
    
}
