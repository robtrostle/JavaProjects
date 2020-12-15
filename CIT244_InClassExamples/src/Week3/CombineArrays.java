
package Week3;

import java.util.Arrays;

public class CombineArrays {

    public static void main(String[] args) {
        // TODO code application logic here
        String[] fruits = {"peach","kiwi","banana","strawberry","pear",};
        String[] vegetables = {"carrot","sprout","parsnip","broccoli",};
        
        String[] fruitsAndVegetables = combineArrays(fruits, vegetables);
        System.out.println(Arrays.toString(fruitsAndVegetables));
        
    }
    public static String[] combineArrays(String[] a1, String[] a2){
        //get the size of each array
        int length1 = a1.length;
        int length2 = a2.length;
        int size = length1 + length2;
        
        String[] combinedArray = new String[size];
        
        //load the first array in to the combined array
        for (int i = 0; i < a1.length; i++) {
            combinedArray[i] = a1[i];
            
        }//starting at element 5 of combined array (length of a1)
        int current = 0;
        //keeps track of where we are in a2. Stopping at less than size of both
        for (int j = length1; j < size; j++) {
            combinedArray[j] = a2[current];//Can't start at j b/c j=5!
            current++;//to increment the current position of a2

        }
        
        return combinedArray;
    }
}
