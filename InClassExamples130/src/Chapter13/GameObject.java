
package Chapter13;

/**
 *
 * @author robtr
 */
public abstract class GameObject {

    //You can't make an object of an abstract class. 
    public static void main(String[] args) {
        
//        Player player = new Player();
//        player.draw();
//        
//        Menu menu = new Menu();
//        menu.draw();

        GameObject player = new Player();
        GameObject menu = new Menu();
//        player.draw();
//        menu.draw();
        
        //loop game objects
        GameObject[] gameObjects = new GameObject[2];//create an array of gameObjects
        gameObjects[0] = player;
        gameObjects[1] = menu;
        //for each gameObject, go, in my game object array, take my object, go and draw
        for (GameObject go : gameObjects){
            go.draw();          
        }
        
        Player player2 = new Player();
        player2.attack();//player 2 is a player object so it has access to the attack
        //method. Player is a gameObject so it doesn't. They can only access the abstract
        //methods of the gameObject class. 
    }
    
    public abstract void draw();//you need to implement all abstract methods
    //abstract methods are just the method headers. No body. 
}
