
package Chapter9;

/**
 *
 * @author robert.trostle
 */
public class Countable {
    
    private static int instanceCount = 0;//making private doesn't allow you to change it. 
    //
    
    public Countable()//contstructor
    {
        instanceCount++;
    }
    
    public int getInstanceCount(){
        
        return instanceCount;
        
    }
    
}
