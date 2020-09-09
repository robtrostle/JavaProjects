
package Chapter12;

/**
 *
 * @author robtr
 */
class SuperCoolTotallyNotMadeUpException extends Exception {
    
    public SuperCoolTotallyNotMadeUpException(){
        System.err.println("Error of super coolness");
    }
    public SuperCoolTotallyNotMadeUpException(String s){
        System.err.println(s);
        
    }
    

    
}
