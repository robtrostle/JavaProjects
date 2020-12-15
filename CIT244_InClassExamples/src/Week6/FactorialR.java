
package Week6;


public class FactorialR {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Factorial(4));
        
    }
    public static int Factorial(int n)
    {
       
        
        if(n == 0)
        {
           return 1;
        }
    
        return n * (Factorial(n - 1));
    }  
}
