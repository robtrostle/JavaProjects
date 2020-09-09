/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

/**
 *
 * @author robert.trostle
 */
public class ArrayExample7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] wordArray = {"Car", "School", "Sky", "Room"};
        //you can also say String wordArray[] = {""""""""""""};
        System.out.println("Word from the array: " + wordArray[1]);
        
        double[] decimalArray = new double[2];
        
        decimalArray[0] = 3.14;
        decimalArray[1] = .555;
        System.out.println("Number from decimalArray: " + decimalArray[0]);
        
        
        
        
        
    }
    
}
