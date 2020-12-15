
package Week6;


public class FibonacciR {

    
    public static void main(String[] args) {
        // TODO code application logic here
      
            
        System.out.println(fib(10));
        
    }
    
    public static long fib(int n) 
    { 

            if(n < 2)
            {
                return n;
                
            }else {
                return fib(n-1)+fib(n-2);
            }
    }
}
     
        
        
    
