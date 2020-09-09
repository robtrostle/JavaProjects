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
public class ArrayMethod {

  
    public static void main(String[] args) {
        // an array is a data type
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.print("Enter the first number: ==> ");
        num1 = scan.nextInt();
        System.out.print("Enter the second number: ==> ");
        num2 = scan.nextInt();
        System.out.print("Enter the third number: ==> ");
        num3 = scan.nextInt();
        
        int[] numArray = getArray(num1, num2, num3);
        
        for (int i : numArray) {
            System.out.println(i + ", ");
        }
        

    } public static int[] getArray(int n1, int n2, int n3)
    {
        int[] array = {n1, n2, n3};
        return array;
    }
}
