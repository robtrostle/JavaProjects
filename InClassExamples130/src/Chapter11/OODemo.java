
package Chapter11;

public class OODemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Overloading ol = new Overloading();
        Overriding or = new Overriding();
        
        //initial method 
        System.out.println("Calling dosomething with 1 String: ");
        ol.doSomething("TEST");
        
        //Calling the overloaded method with 2 strings
        System.out.println("Calling dosomething with 2 strings");
        ol.doSomething("TEST", "Another test");//will include the and from constructor
        
        //Calling the method with an int
        System.out.println("Calling doSomething with an int.");
        ol.doSomething(12);
        
        //
        System.out.println("Calling doSomething OVERRIDDEN from overriding class");
        or.doSomething("TEST");
    }
    
}
