
package Chapter11;

/**
 *
 * @author intital method doSomething takes a String of s. 
 */
public class Overloading {
    
    public void doSomething(String s){
        System.out.println("String " + s);
    }
    //Overload doSomething
    //if the user calls doSomething with Two Strings, this method will be called. 
    public void doSomething (String s1, String s2){
        System.out.println(s1 + " AND " + s2);
        
    }//overload with a different data type (int)
    public void doSomething (int n){
        System.out.println("Number: " + n);
    }
    
    
}
