
package Week6;

import java.util.Scanner;


public class EnterNameR {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        Hello(scan);
        
        
    }
    public static void Hello(Scanner sc)
    {   
        
        String s = "";
        System.out.print("Enter a name \"none\" will end program: ");
        s = sc.next();
        
        if (s.equalsIgnoreCase("none"))
        {
            return;
        }
        System.out.println("Hello, " + s);
        Hello(sc);
        
    }
    
}
