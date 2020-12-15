
package Week3;

/**
 *
 * @author robtr
 */
public abstract class GameObject {

    public static void main(String[] args) {
        //cannot make an object of an abstract class. 
//        Player player = new Player();
//        player.draw();
//        
//        Menu menu = new Menu();
//        menu.draw();

            GameObject player = new Player();
            GameObject menu = new Menu();
//            player.draw();
//            menu.draw();
            
            //Loop game objects
            GameObject[] gameObjects = new GameObject[2];
            gameObjects[0] = player;
            gameObjects[1] = menu;
            
            for (GameObject go : gameObjects) {
                go.draw(); 
                
        }
            Player player2 = new Player();
            player2.attack();
            
    }
    
    public abstract void draw();//don't have body
    
    
    
}
