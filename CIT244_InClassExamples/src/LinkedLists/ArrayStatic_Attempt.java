/*
In Class Activity | Making an array Dynamic

Demonstrating how we can go about working around the constraints of a static 
array, what if we want to add elements to an array of size 3? We can't because, well
it's size 3 forever, and always but ... we can
 */
package LinkedLists;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStatic_Attempt {

    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
        String name;
        String[] names = new String[3];
        String[] moreNames = new String[0];
        String[] moreNamesOLD;
        
        int i = 0;
        while(true)
        {
            // If "END" we stop
            
            System.out.print("Enter name " + (i+1) + ": ");
            name = scan.nextLine();
            
            // If they chose to END, remove this from the array and break loop
            if(name.equalsIgnoreCase("END")) {
                break;
            }
            
            if(i >= 3) {
                // Copy contents of the current array before creating new
                moreNamesOLD = moreNames;
                
                moreNames = new String[i + 1];
                
                for(int k = 0; k < i; k++)
                {
                    if(k < names.length)
                        moreNames[k] = names[k]; 
                    else
                        moreNames[k] = moreNamesOLD[k];
                }
                
                // Add the new name to the newly adjusted array at i+1 
                moreNames[i] = name;
                
            }
            else {
               names[i] = name; 
            }
            
            i++;
        }
        
        // Determine what version of the array to print if 3 names or less 
        // print original names, otherwise more names
        if(i > 3 && name.equalsIgnoreCase("END"))
        {
            System.out.println("\nMoreNames:");
            printArr(moreNames);
            //System.out.println(Arrays.toString(moreNames));
        }
        else
        {
            System.out.println("\nNames:"); 
            printArr(names);
            //System.out.println(Arrays.toString(names));
        }
        
        
        
        
        
    }
    
    public static void printArr(String[] arr)
    {
        // Print contents of array
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }  
    }
    
}