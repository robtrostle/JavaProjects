/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review2;

/**
 *
 * @author robert.trostle
 */
public class VoidMethodExampleFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "Hello";
        
        saySomething(text);
        //you can also pass in the string directly
        saySomething("Goodbye");
        //we provied the tool(the string) to do its job which is to print a string
       
        
    }
    
    public static void saySomething(String s){//the s's purpose is to be replaced by whatever you give it. 
        //promise instead of an argument. you're making a promise. 
        //If we ever call it, i'm gonna give you a string. 
        //it's like telling someone the tool they need to perform a job. 
        System.out.println(s);
    }
    
}
