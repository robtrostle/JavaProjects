/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadTextDefaultLocation {

    
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file = new File("example.txt");
        //reads from/writes to file
        try{
        Scanner input = new Scanner(file);
        
        while(input.hasNext()){
            System.out.println(input.nextLine());
    }
    //close the file
    input.close();
    }
    catch(FileNotFoundException ex){
            System.out.println(file + " not found.");
}
}}
