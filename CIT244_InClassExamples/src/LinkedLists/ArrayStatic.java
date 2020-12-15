package LinkedLists;
import java.util.Scanner;

/*
This program shows the static limitations of an Array in Java
our Array of size 3, meaning we can store 3 Strings in this array
if we try to store any more we crash, if we store any less we have NULL values

Demo program: Working, Null Values, Crashing
*/

public class ArrayStatic {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        String name;
        String[] names = new String[3];
        
        int i = 0;
        
        while(true)
        {
            // If "END" we stop
            
            System.out.print("Enter name " + (i+1) + ": ");
            name = scan.nextLine();
            
            // If they chose to END, remove this from the array and break loop
            if(name.equalsIgnoreCase("END"))
            {
                //names[i] = null;
                break;
            }
            names[i] = name;
            i++;
        }
        
        System.out.println("");
        // Print contents of array
        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j]);
        }
        
    }
    
}