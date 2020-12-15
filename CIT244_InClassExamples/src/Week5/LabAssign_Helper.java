
package Week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LabAssign_Helper {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dig1, dig2, dig3, dig4;
        
        String line;
        String[] tokens;
        Scanner scan = null;
        File f = new File("Sequence.txt");
        
        //
        try{
            scan = new Scanner(f);
        }
        catch(FileNotFoundException ex){
            System.out.println("Error reading from the text file");
            System.exit(0);
        }//continue reading file for integer input
        while(scan.hasNext()){
            line = scan.nextLine();
            tokens = line.split(" ");//split the line into an array where it finds spaces
            //prnt size of current line
            //System.out.println("Size of line " + tokens.length);
            if(tokens.length == 4){
                try{
                    dig1 = Integer.parseInt(tokens[0]);
                    dig2 = Integer.parseInt(tokens[1]);
                    dig3 = Integer.parseInt(tokens[2]);
                    dig4 = Integer.parseInt(tokens[3]);
                    System.out.println("Four digits: "
                            + dig1 + " " + dig2 + " " + dig3 + " " + dig4);
                }
                catch(NumberFormatException ee){
                    //not all numeric
                    System.out.println("Not all digits: " + line);
                }
            }
            else {
                System.out.println("NOT 4 digits: " + line);
            }
           } 
            scan.close();
            System.out.println("No more data in the file");
            System.exit(0);
                    
        
        
    }
    
}
