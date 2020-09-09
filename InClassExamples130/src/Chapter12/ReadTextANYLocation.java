
package Chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author robtr
 */
public class ReadTextANYLocation {

    
    public static void main(String[] args) throws FileNotFoundException {
        //right click on properties to get the file path. 
        File file = new File("C:\\Users\\robtr\\OneDrive\\Desktop\\AnotherExample.txt");
        
        try{
        //Reads from/Writes to file
        Scanner input = new Scanner(file);
        
        while(input.hasNext()){ //while there is something in the file, print the next thing
            System.out.println(input.nextLine());
        }
        //Close the file 
        input.close();
        } 
        catch(FileNotFoundException ex){
            System.out.println(file + " not found");
        }
                
    }
    
}
