/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review1;

/**
 *
 * @author robert.trostle
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double r1;
        int r2;
        
        
        
        r1 = Math.random();
        
        System.out.println(r1);
        //casting 
        r2 = (int) (Math.random() * 10 + 1);
        //you can multiply by any number. ex 50 for 50 random numbers. 
        System.out.println(r2);
        
    }
    
}
