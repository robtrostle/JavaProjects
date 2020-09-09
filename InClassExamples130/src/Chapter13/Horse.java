
package Chapter13;

/**
 *
 * @author robtr
 */                         //You must extend before implement
public class Horse extends TalkingAnimal implements Animal {
    
    @Override
    public void eats(){
        System.out.println("Eating Hay.");
    
}   @Override
   public void sound(){
        System.out.println("Naaayyyyy");
}

}
