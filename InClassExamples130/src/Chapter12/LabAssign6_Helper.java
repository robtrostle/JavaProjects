
package Chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author robtr
 */
public class LabAssign6_Helper {

   
    public static void main(String[] args) {
        
        int dig1, dig2, dig3, dig4;   //only need two of these for lab 6
        String line;
        String[] tokens;  //string array
        
        Scanner scan = null;
        File f = new File("sequence.txt");
        
        //try to open/find the file
        try{
            scan = new Scanner(f);
        }
        catch(FileNotFoundException e){
            System.out.println("Error reading from the text file.");
            System.exit(0);
        }
        //continue reading file for integer input. 
        while(scan.hasNext()){
            
            line = scan.nextLine();//read a line then parse
            tokens = line.split(" ");//split the line into an arry where it finds spaces
            //print the size of current line (#tokens)
            //System.out.println("Size of line " + tokens.length);
            
            //if tokens is four, see if each token is numeric
            if(tokens.length == 4){
                try{
                    dig1 = Integer.parseInt(tokens[0]);//Freq & Duration on L6?
                    dig2 = Integer.parseInt(tokens[1]);
                    dig3 = Integer.parseInt(tokens[2]);
                    dig4 = Integer.parseInt(tokens[3]);
                    System.out.println("Four Digits: " + dig1 + dig2 + dig3 + dig4);
                }
                catch(NumberFormatException ee){
                    //Not all numeric
                    System.out.println("NOT ALL DIGITS: " + line);
                }
            }
            else{
                System.out.println("NOT FOUR DIGITS: " + line);
            }
        }scan.close();
        System.out.println("No more data in the file. ");
        System.exit(0);
        
    }
    
}
