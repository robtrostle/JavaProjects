
package Chapter12;

/**
 *
 * @author robtr
 */
public class MyException {

     public static void main(String[] args) {
        
         int n = 9;
         
         try{
             
             if(n < 10){
                 //throw new SuperCoolTotallyNotMadeUpException();
                 throw new SuperCoolTotallyNotMadeUpException("You have an error");

             }
             
         }catch(SuperCoolTotallyNotMadeUpException ex){
             System.out.println("Caught it!");
         }
    }
    
}
