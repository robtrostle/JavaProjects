
package Week7;

import java.util.Arrays;


public class DemoRandom {

    public static void main(String[] args) {
        
        // RANDOM
        int[] ran1 = RandomUnsortedArray.numbers(5, 100);
        System.out.println(Arrays.toString(ran1));
        
        int[] ran2 = RandomUnsortedArray.numbers(5, 100);
        System.out.println(Arrays.toString(ran2));
        
        System.out.println("");
        
        // NOT SO RANDOM
        int[] notSoRan1 = RandomUnsortedArray.notRandomNumbers(5);
        System.out.println(Arrays.toString(notSoRan1));
        
        int[] notSoRan2 = RandomUnsortedArray.notRandomNumbers(5);
        System.out.println(Arrays.toString(notSoRan2));
        
    }
    
}