package LabAssign5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class CurlyCheckerIO_Trostle {

//    /**
//     * @param Lab_Assign_5 - Robert Trostle
//     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("---First File---");
           // Empty stack
        Stack<Character> stack = new Stack();
        String s1 = "SportsTeam1.java", s2 = "SportsTeam2.java";

        //Create array of curlys from file read in
        Character[] file = getArray(s1);
        //System.out.println(Arrays.toString(file));
        
        //Find last element in array that is NOT null
        int end  = findLastElement(file);
        //Print Array (but not nulls)
        printArray(file, end);
        //pushes & pops to stack
        boolean badClose = bChecker(file,stack,end);
        //Prints if stack is balanced or not
        balanced(s1, stack, badClose);
        System.out.println(end);
        
        System.out.println("---Second File---");
           // Empty stack
        Stack<Character> stack2 = new Stack();

        //Create array of curlys from file read in
        Character[] file2 = getArray(s2);
        
        //Find last element in array that is NOT null
        int end2  = findLastElement(file2);
        //Print Array (but not nulls)
        printArray(file2, end2);
        //pushes & pops to stack
        boolean badClose2 = bChecker(file2,stack2,end2);
        //Prints if stack is balanced or not
        balanced(s2, stack2, badClose2);
        System.out.println(end2);

    }
    public static Character[] getArray(String f)
    {
        Character[] arr = new Character[100];//Create 
        Scanner scan = null;//Establish our scanner object. 
        
        File file = new File(f);//Read in our file
        String line;
        //Character c = new Character(line);
        
        System.out.println("File Loaded");//let user know the file loaded. 
        
        int count = 0;//count variable to fill 
        
        try{
            
            scan = new Scanner(file);//try to read our file
            
            while(scan.hasNext()){//while the file has data, do the following
            
            line = scan.next();//Scan each line in our string f variable
            
            //arr = line.toCharArray();
            //Character c = new Character(line.charAt(count));
            if(line.charAt(0) == '{' || line.charAt(0) == '}'){
            arr[count] = line.charAt(0); 
            }else{
                continue;
            }
           count++;
        }
             
        }
        catch(FileNotFoundException ex){//if file is not found, exit gracefully. 
            System.err.println(file + " not found.");
            System.exit(0);
}
        System.out.println("Finished reading file & Creating array.");
        return arr;//return the character array. 
    }
    public static boolean bChecker(Character[] b, Stack s, int end) 
    {
        for (int i = 0; i < end; i++) 
        {
            if(b[i] == '{')
            {
                s.push(b[i]);
            }
            else if(b[i] == '}') // Have to make sure it's EMPTY before we pop (See brace5)
            {
                if(!s.isEmpty())
                {
                   s.pop();
                }
                // If we find } but it's already empty it's unblanaced so FORCE CLOSE program
                else 
                {
                    System.out.println("\nFound } but stack is empty .. "
                            + "cannot be balanced.");
                    System.out.println("Not balanced ..");
                    return false;
                    
                }
                
            }
            else
            {
                System.out.println("Move along, nothing to see here.");
            }
        }
        return true;

    }
    public static int findLastElement(Character[] arr){
        
        int last = 0;
        
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == null){
            last = i;
            break;
            }
            else{
                  last = arr.length;
            }
        }
        return last;
    }
    
    // Print the contents of the stack 
    
    public static void printArray(Character[] arr, int end)
    {
        for (int i = 0; i < end; i++) {
            System.out.print(arr[i] + ", ");
        }
        
    }
    public static void balanced(String f, Stack s, boolean bc)
    {
         //Display balanced or not
        System.out.println("\n"+s);
//        if(s.empty()) {
//            System.out.println(f+" is balanced!");
//        }
//        else {
//            System.out.println(f+" is not balanced ..");
//        }
        if(bc == true) {
            System.out.println(f+" is balanced!");
        }
        else{
            System.out.println(f+" is not balanced ..");
        }
    }

}
    

