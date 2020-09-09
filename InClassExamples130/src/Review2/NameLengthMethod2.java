/*

 */
package Review2;

import java.util.Scanner;


public class NameLengthMethod2 {

   
    public static void main(String[] args) {
       
        String name = getUserName();
        int len = getNameLength(name);
        outputMessage(name, len);///give it a string and an int. 

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
     public static void outputMessage(String n, int nameLength){
         System.out.println(n + " has " + nameLength + " characters.");
     }
    
}
