
package Week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class VowelsInNames {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = null;//load file into scanner
        File f = new File("names.txt");
        String currentName;
        int count;
        //try to open the file if we cannot catch it, end program. 
        try{
            scan = new Scanner(f);
            System.out.println("File found & opened!");
        }
        catch(FileNotFoundException fne){
            System.out.println("File not found.");
            System.exit(0);
        }
        
        while(scan.hasNext())
        {//each iteration assign new value to currentName
            currentName = scan.next().toLowerCase();//string method
            //count how many vowels are in the given name.
            count = countVowels(currentName);
            System.out.println(currentName + " contains " + count + " vowels.");
        }
       
        
        
        
        //algo to count vowels in given name
    }public static int countVowels(String name){
        int vc = 0;
        char[] vowels = "aeiouy".toCharArray();
        
        //loop through the char array. 
            for (int i = 0; i < name.length(); i++) {
                //loop through the char array to find a match
                for (int j = 0; j < vowels.length; j++) {
                    //if charactrer in the name matches char in vowels array
                    if(name.charAt(i)== vowels[j])
                    {//increment when corrent pos of name matches vowels
                        vc++;
                    }
                    
                }
                //leave nested loop
            }
        
        return vc;
        
    }
    
}
