
package Week4;

/**
 *
 * @author robtr
 */
public class BriefArrayRefresher {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int sum1, sum2, total;
        int[] array1 = new int[2];
        array1[0] = 10;
        array1[1] = 90;
        
        int[] array2 = {10,20,1,5,4,10};
        //print
        printArray(array1);
        printArray(array2);
        //sum each array
        sum1 = sumArray(array1);
        sum2 = sumArray(array2);
        total = sum1 + sum2;
        System.out.println("\n The sum of both arrays is: " + total);
                
    }
    //how to print array using a for loop
    public static void printArray(int[] arr){
        
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length -1)//get rid of comma at the end
            System.out.print(arr[i] + ", ");
            else
                System.out.println(arr[i]);
        }
        
    }
    public static int sumArray(int[] arr){
        int sum = 0;
        
        for (int e : arr) {
            sum += e;       
        }
        return sum;
    }
    
}
