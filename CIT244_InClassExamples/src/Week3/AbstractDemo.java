
package Week3;

/**
 *
 * @author robtr
 */
public class AbstractDemo extends AbstractExample {

    
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractExample.youCan();
    }

    @Override
    public void youMust() {
        throw new UnsupportedOperationException("You must override this."); 
    }
    
}
