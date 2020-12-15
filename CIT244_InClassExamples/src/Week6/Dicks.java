
package Week6;

import java.util.Arrays;

public class Dicks {
    public static void main(String[] args) {
        
         int A[] = {-5,-2};
         int flag = solution(A);
         System.out.println(Arrays.toString(A));
         System.out.println(flag);    
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int result = 1;
        for(int i = 0; i < A.length; i++){
            if (A[i] < 0) {
            continue;
            }
            else if(A[i] == result) {
            result++;
            }
        }
        return result;
    }
}
