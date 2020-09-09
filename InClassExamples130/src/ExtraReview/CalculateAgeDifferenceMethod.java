/*
Calc the difference in ages

 */
package ExtraReview;

import java.util.Scanner;


public class CalculateAgeDifferenceMethod {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int age1,age2;
        
        age1 = validateAge();
        age2 = validateAge();
        
        determineDifference(age1,age2);
        
    }
    public static int validateAge()//if there are no args, you need to declare local vars. 
    {   int age;
        Scanner scan = new Scanner(System.in);
        
        do{
        System.out.print("Enter your age: ");
        age = scan.nextInt();
        }while(age <= 0);
        
        return age;
    }
    public static void determineDifference(int a1, int a2)
    {   int diff;
    
        if(a1 >= a2){
            diff = a1 - a2;
        }
        else {
            diff = a2 - a1;
        }
        System.out.println("The difference in age is " + diff + " year(s).");
    }
}
