/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author robtr
 */
public class FinallyExcample {

                           //prepare main for the chance of exception
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        int n;
        
        try{
            System.out.print("Enter the number 2: ");
            n = scan.nextInt();
            
            if(n != 2){
                throw new Exception();
            }
            else{
                System.out.println("Yay that was the number 2!");
            }
            
        }
        catch(InputMismatchException ex){
            System.out.println("NOT AN INTEGER");
        }                                         //YOu can catch 2 different types              
        catch(Exception e){
            System.out.println("Not the number 2");
            throw new Exception("Some kind of error IS happenong");
        }
        finally{//will execute no matter if the program crashed or not. 
        System.out.println("The end...");
        
       
    }
    
}}
