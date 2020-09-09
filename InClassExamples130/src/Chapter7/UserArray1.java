/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

import java.util.Scanner;

/**
 *
 * @author robert.trostle
 */
public class UserArray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int size;
        String[] wordArray;
        
        do{
        System.out.println("How many words would you like to store in the "
                + "array? --> ");
        size = scan.nextInt();
       
    } while(size <= 0);//keep looping until you put in a positive value
    //Create an array based on user defined size
      wordArray = new String[size];
      
      //Allow user to fill the array using a for loop
        for (int i = 0; i < wordArray.length; i++) {
            
            System.out.print("Enter word #" + (i+1)  + " --> ");
            wordArray[i] = scan.next();
            
        }//Display the contents of the array   for each element in the array
        for(String w : wordArray){//w is each element in the array
            
            System.out.println(w + ", ");
        }
        System.out.println(wordArray[0] + wordArray[1]);
}}
