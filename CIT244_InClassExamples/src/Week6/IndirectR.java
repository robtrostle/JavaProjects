
package Week6;


public class IndirectR {

  
    public static void main(String[] args) {

       firstCount(11);
        
    }
    public static void firstCount(int n)
    {
        if(n == 0)
        {
            System.out.println("Stopping in the FIRST method");
        }else
        {
            System.out.println(n + " Time to call SecondCount!");
            n--;
            secondCount(n); 
        }
        
    }
    public static void secondCount(int n)
    {
        if(n == 0)//base case
        {
            System.out.println("Stopping in the SECOND method");
        }
        else
        {
            System.out.println(n + " Time to call firstCount!");
            n--;
            firstCount(n);  
        }
        
    }
}
