package Week8;
/*Lab Assignment 4  - Robert Trostle
 PDF Instructions can be found on blackboard
 Files Required: AllSorts, AllSearch, (And this file)
 */

import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class SortSearchAssign_TrostleRobert {

    public static void main(String[] args) {
        
        // START HERE
        createFile();//call create file
        int x = 89;//establish the number to search for
        
        AllSearch search = new AllSearch();
        AllSorts sort = new AllSorts();
        
        int[] numArray = getArray();//get our integer array of nums. 
        
        //numArray = sort.insertionSort(numArray); 2 minutes 26 seconds
        //bubbleSort + anything = WAY too long. 
        //selctionSort + binSearch = Also too long.
        //numArray = sort.insertionSort(numArray) (with jumpSearch);2 minutes 59 seconds
        //merge sort + jumpSearch = 2 seconds
        //merge sort + binSearch = 2 seconds
        //merge sort + linearSearch = 3 seconds
        //numArray = sort.quickSort(numArray, 0, 100);//total time: 6 seconds
        
        
        //numArray = sort.mergeSort(numArray) + binSearch;//total time: 1 seconds
        
        numArray = sort.mergeSort(numArray);
        System.out.println("Array Sorted");
        System.out.println("numArray's Length: " + numArray.length);//checking the length of the array
        System.out.println(search.binSearch(numArray, x));
        
        //Combination of mergeSort and binSearch yeilds the fastest compile time
        //therefore, these are the most efficient algorithms. 
        
    }

    // Method which generates text file containing 1 million random numbers
    public static void createFile() 
    {
        // File to be created in default directory
        File file = new File("somanynumbers.txt");
        Random rng = new Random();
        int r;

        try {
            // Create the file
            PrintWriter output = new PrintWriter(file);

            // Write random numbers into a file
            for (int i = 0; i < 1000000; i++) 
            {
                // Genereates a random number in range of (0 - 100)
                r = rng.nextInt(101);
                output.write(r + ", ");
            }
            System.out.println("File created");
            // Close file
            output.close();
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println("Cannot do that.");
        }
    }
    
    // STUDENT TODO
    public static int[] getArray()
    {
        int[] arr = new int[1000000];//Create int array of size 1 Million
        Scanner scan = null;//Establish our scanner object. 
        String line;//line to hold string values from the file
        File file = new File("somanynumbers.txt");//Read in our file
        System.out.println("File Loaded");//let user know the file loaded. 
        //int count = 0;//count variable to fill our numArray
        
        try{
            
            scan = new Scanner(file);//try to read our file
            
            while(scan.hasNext()){//while the file has data, do the following
            
            line = scan.nextLine();//Scan each line in our string line variable
            
            String[] values = line.split(", ");//Get rid of the comma and space
            //as well as create a string array to hold the values
                
                for (int i = 0; i < values.length; i++) {//loop through the string array 
                    arr[i] = Integer.parseInt(values[i]);//and convert the strings to ints
                }                                       //filling up the int array 
            //count++;
        }
            
        }
        catch(FileNotFoundException ex){//if file is not found, exit gracefully. 
            System.err.println(file + " not found.");
            System.exit(0);
}
        System.out.println("Finished reading file & Creating array.");
        return arr;//return the int array. 
    }

}