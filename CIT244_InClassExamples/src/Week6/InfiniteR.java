package Week6;

public class InfiniteR {

    public static void main(String[] args) {

        // someLoop();
        // someRecursion(5);
        
        someRecursionBaseCase(5);
    }
    
    // Infinite loop
    public static void someLoop() 
    {
        while(1 < 5)
        {
            System.out.println("This will go on forever.");
        }
    }
    
    // Recursion (Infinite)
    public static void someRecursion(int n)
    {
        System.out.println("This will also happen forever!");
        someRecursion(n);
    }
    
    public static void someRecursionBaseCase(int n) 
    {
        // Base case (Tells method when to stop)
        if(n == 0)
        {
            // Stop
            return;
        }
        
        System.out.println("This won't happen forever ..");
        someRecursionBaseCase(n - 1);
    }
    }
    

