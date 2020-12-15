
package Week5;

import java.util.Arrays;


public class toCharArrExample {

    
    public static void main(String[] args) {
        // TODO code application logic here
        char[] myName1 = {'R','o','b'};
        System.out.println(Arrays.toString(myName1));
        
        //Name formatted as a sring
        String name = "Trostle";
        //a second char array but this time we just us the method
        char[] myName2 = name.toCharArray();
        System.out.println(Arrays.toString(myName2));
    }
    
}
