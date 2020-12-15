
package Week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CountGoldilocks {

    
    public static void main(String[] args) {
        // TODO code application logic here
        String searchWord = "";
        int wordCount = 0;
        
        Scanner scan = new Scanner(System.in);
        File f = new File("Goldilocks.txt");
        
        System.out.print("Enter a word to search in Goldilocks"
                + " & The Three Bears: ");
        searchWord = scan.next();
        
        try{
            Scanner input = new Scanner(f);
            
            while(input.hasNext()){
                if(input.next().equalsIgnoreCase(searchWord)){
                    wordCount++;
                }
            } input.close();
        }
        catch(FileNotFoundException ex){
            System.out.println(f + " not found.");
        }
        
        System.out.println(searchWord + " found " + wordCount + " times "
                + "in the book.");
    }
}
