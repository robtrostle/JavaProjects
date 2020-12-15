
package LinkedLists;

import java.util.*;


public class ArrayListExample2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList names = new ArrayList(3);
        Scanner scan = new Scanner(System.in);
        //manually add elements
        names.add("PersonA");
        names.add("PersonB");
        names.add("PersonC");
        System.out.println(names);
        System.out.println("\nAdding more names");
        names.add("PersonD");
        names.add("PersonE");
        names.add("PersonF");
        System.out.println(names);
        System.out.println("\nRemove and element and resizes automatically");
        names.remove("PersonC");
        System.out.println(names);
        //remove multiple at once
        System.out.println("\nremoving multiple ele at once");
        for (int i = names.size()-1; i > 1; i--) {
            System.out.println("Removing: " + names.get(i));
            names.remove(names.get(i));
        }
        System.out.println("\nArrayList is now:");
        System.out.println(names);
        
        
        
    }
    
}
