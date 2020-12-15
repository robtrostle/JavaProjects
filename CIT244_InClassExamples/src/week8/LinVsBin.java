
package Week8;

import java.util.Arrays;

public class LinVsBin {

    public static void main(String[] args) {
        
        int[] array = RandomUnsortedArray.numbers(100000, 100);
        
        int x = 10;
        
        AllSearch search = new AllSearch();
        AllSorts_Tester sort = new AllSorts_Tester();
        
        // Linear
        //System.out.println(search.linearSearch(array, x));
        
        // Binary (Note: MUST SORT FIRST)
        array = sort.mergeSort(array);
        System.out.println(search.binSearch(array, x));
       
        
        
    }
    
}