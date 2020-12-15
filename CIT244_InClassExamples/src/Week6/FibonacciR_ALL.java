
package Week6;


public class FibonacciR_ALL {

    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 20; i++) {
            System.out.println((i) + " in the sequence = " + fibonacci(i));
        }
        
    }
    
    public static long fibonacci(int n)
    {
        // Base case to stop
        if(n < 2)
        {
          return n;  
        }
        else 
        {
            return(fibonacci(n - 1) + fibonacci(n - 2));
        }
    }
    
}