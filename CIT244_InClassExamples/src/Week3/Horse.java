
package Week3;

/**
 *
 * @author robtr
 *///must extend before implements
public class Horse extends TalkingAnimal implements Animal {
    @Override//order does not matter as long as they are all here.
    public void eats(){
        System.out.println("Eating hay.");
    }
    @Override
    public void sound(){
        System.out.println("Naaayyyyy");
    }
    
}
