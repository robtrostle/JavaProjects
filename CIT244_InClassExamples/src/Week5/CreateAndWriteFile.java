/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class CreateAndWriteFile {

    
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file = new File("myownfile.txt");          //Can also do a try catch
        //reads from/writes to file
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(0);
            
        }
        //create the file 
        PrintWriter output = new PrintWriter(file);
        //write formatted output to file
        output.println("I'm writing this in Java.");
        output.print("But it outputs to a text file ");
        output.println(123);
        
        output.close();
   }
}
