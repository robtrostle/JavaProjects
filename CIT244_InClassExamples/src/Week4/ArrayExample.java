
package Week4;

import java.util.Arrays;

/**
 *
 * @author robtr
 */
public class ArrayExample {

    
    public static void main(String[] args) {
        
        int[] wholeNumbers = new int[2];
        wholeNumbers[0] = 5;
        wholeNumbers[1] = 7;
        System.out.println(wholeNumbers[0]);
        
        System.out.println(Arrays.toString(wholeNumbers));
        //String array using the shortuct method
        String[] wordArray = {"car", "school", "sky", "kite", "room"};
        System.out.println("Word from the String array is:  " + wordArray[4]);
        double[] decimalArray = new double[2];
        decimalArray[0] = 3.14;
        decimalArray[1] = .555;
        System.out.println("Index from the decimal array: " + decimalArray[1]);
        
        
    }
    
}
