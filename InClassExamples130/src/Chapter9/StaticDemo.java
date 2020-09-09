
package Chapter9;

/**
 *
 * @author robert.trostle
 */
public class StaticDemo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int objectCount;
        
        Countable c1 = new Countable();//object
        Countable c2 = new Countable();
        Countable c3 = new Countable();
        
        objectCount = c1.getInstanceCount();
        System.out.println(objectCount + " instance(s) of the class created.");
        
       // Countable.instanceCount = 500;//Shouldn't be able to change it which is why we made it private. 
        
    }
    
}
