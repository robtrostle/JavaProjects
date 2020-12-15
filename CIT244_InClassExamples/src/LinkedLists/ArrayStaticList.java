
package LinkedLists;
import java.util.*;

public class ArrayStaticList {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String name;
        ArrayList names = new ArrayList();
        
        int count = 1;
        while(true)
        {
            System.out.print("Enter name " + count + " : ");
            name = scan.nextLine();
            
            if(name.equalsIgnoreCase("END"))
            {
                break;
            }
            //add names to the list
            names.add(name);
            
            count++;
        }
        System.out.println("\nNames");
        for (int i = 0; i<names.size(); i++) {
            System.out.println(names.get(i));
        }
        
    }
    
}
