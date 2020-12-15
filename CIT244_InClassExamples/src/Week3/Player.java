
package Week3;

//inheriting from gameObject 
public class Player extends GameObject {
    @Override
    public void draw(){
        System.out.println("Drawing Player...");
    }
    public void attack(){
        System.out.println("Attacking!");
    }
}
