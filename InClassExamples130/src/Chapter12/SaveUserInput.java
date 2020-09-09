age Chapter12;





import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author robtr
 */
public class SaveUserInput {

    
    public static void main(String[] args)  {
        
        File file = new File("userFile.txt");
        Scanner scan = new Scanner(System.in);
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(0);
        }
        
        //Create the file
        try{
        PrintWriter  output = new PrintWriter(file);
        
            System.out.print("Enter your name --> ");
            output.write(scan.nextLine());
            
            output.close();
                       
        }
        catch(FileNotFoundException ex){
            System.out.println("Cannot do that.");
        }
        
    }
    
}
