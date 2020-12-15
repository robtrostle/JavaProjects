
package Week6;

/**
 *
 * @author robtr
 */
public class CountDownR {

  
    public static void main(String[] args) {

        countDown(10);
        
    }
    public static void countDown(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(n);
        countDown(n-1);
    }
}
