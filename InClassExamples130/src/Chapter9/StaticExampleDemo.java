
package Chapter9;

import java.util.Scanner;

/**
 *
 * @author robert.trostle
 */
public class StaticExampleDemo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        StaticExample.drive();//You can access static object from the main without creating an instance of the class. 
        
        //must create an object to access a non static object
        StaticExample se = new StaticExample();
        se.fly();
        
        //static variables are shared among all object of a class. 
    }
   
}
