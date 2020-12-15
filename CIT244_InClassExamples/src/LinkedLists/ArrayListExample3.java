
package LinkedLists;

import java.util.*;


public class ArrayListExample3 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList things = new ArrayList();
        System.out.println(things);
        things.add("Item A");
        System.out.println(things);
        things.add("Item B");
        System.out.println(things);
        things.add("Item C");
        System.out.println(things);
        //Get the size of the list
        System.out.println("Size is " + things.size());
        //get the second element(index 1)
        System.out.println("Index 1 = "+ things.get(1));
        //remove item b (index 1)
        things.remove(1);
        System.out.println(things);
        //show new index one has been shifted
        System.out.println("Index 1 = "+ things.get(1));
        
        //add different kinds of items(it's wrapped) as an object not int
        things.add(2);
        System.out.println(things);
        //add items at specific positions without shifting
        things.add(0, "First");
        System.out.println(things);
        
        things.add(2, 123.456);
        System.out.println(things);
        
        //clear list
        things.clear();
        System.out.println(things);
    }
    
}
