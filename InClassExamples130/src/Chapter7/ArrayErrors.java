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
public class ArrayErrors {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[2];
        
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
    
}
