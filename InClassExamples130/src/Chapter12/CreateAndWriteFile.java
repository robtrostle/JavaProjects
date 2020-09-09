age Chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;Chapter12;

import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author robtr
 */
public class CreateAndWriteFile {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("myownfile2.txt");
        
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(0);
        }
        
        //Create the file
        
        PrintWriter  output = new PrintWriter(file);
        
        //write formatted output to the file
        output.println("I am writing this in java.");
        output.print("But it outputs to a text file.");
        output.println(123);
        
        output.close();
        
        
    }
    
}
