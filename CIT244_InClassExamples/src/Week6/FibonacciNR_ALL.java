
package Week6;


public class FibonacciNR_ALL {

    
    public static void main(String[] args) {
        // 93 takes us to negative (Would need to use BigInteger after this)
        fib(10);
        
    }
    
    public static void fib(int n)
    {
        long f = 1;
        long prev1 = 1;
        long prev2 = 1;
        for (int i = 0; i < n; i++) 
        {
            if(i < 2)
            {
                // Do nothing (Or just use i > 2 instead of else
            }
            else
            {
               // Value of what f was last time around
               prev1 = f; 
               // f new value is prev value + its value from two numbers ago
               // the first time around this will be 1, after that we assign
               // after assigning f (otherwise both numbers = the same)
               f = prev1 + prev2; 
               // before looping back around ensure we store the 1 previous in
               // the variable that holds 2 numbers back (as this will be the 
               // case next time around)
               prev2 = prev1;
            }
            // Print (i + 1) because we started at 0
            System.out.println((i+1) + " in the sequence = " + f);
        }
        
    }
    
}