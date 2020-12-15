//Lab Assignment 3 - Robert Trostle
package Week3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CeaserCipher_Trostle {

    public static void main(String[] args) {
        // 
        Scanner scan = null;//load file into scanner
        File file = new File("passwords.txt");
        String decryptedPasswords = "";//empty string to hold decrypted pw. 
        
        try{
            //try to ingest our file object, looping through it and calling 
            //Assign our empty string to the method call decrypt, passing our
            //shift to 5.
        scan = new Scanner(file);
            System.out.println("***Decrypted***");
        
        while(scan.hasNext()){
            decryptedPasswords = decrypt(scan.next().toLowerCase(),5);
            //print out our decrypted passwords line by line. 
            System.out.println(decryptedPasswords);
            
    }
    //close the file
    scan.close();
    }
    catch(FileNotFoundException ex){//if file is not found, exit gracefully. 
            System.err.println(file + " not found.");
            System.exit(0);
}
        
    }
    public static String decrypt(String pass, int shift)
    {//set our char array to contain all 26 letters of alphabet
        char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String decryptedPW = "";//empty string to hold decrypted pw. 
        int letterPos;//to hold letter position of the char you are looking for within the array. 
        char currentChar;//to hold the current character we are decrypting
        int sub;//to hold our shifted value within the letters array. 
        
        for (int i = 0; i < pass.length(); i++) {
            currentChar = pass.charAt(i);
            letterPos = String.valueOf(letters).indexOf(currentChar);
            sub = letterPos - shift;
            if(sub < 0)
            {                             //=26       + the letter position minus 5. 
                decryptedPW += letters[letters.length + (letterPos - shift)];//Tricky!!
            }
            else{
            decryptedPW += letters[sub];
            }    
        }
        return decryptedPW;//return decrypted password
    }
    
}
