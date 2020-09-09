/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review2;

import java.util.Scanner;


public class NameLengthMethod {

   
    public static void main(String[] args) {
        // TODO code application logic here
        //assign variable to the method call! 
        String n = getUserName();
        int nameLength = getNameLength(n);
        

        System.out.println(n + " has " + nameLength + " characters.");
       
    }
    
    public static String getUserName(){
        //you can also just create it locally. 
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.print("Enter your name --> ");
        name = scan.next();
        
        return name;
        
        
    }
                                //promise it a string! 
            public static int getNameLength(String s){
                int length;
                
                length = s.length();
                //you could also just say return s.length;
                return length;
                
            }
     
    
}
