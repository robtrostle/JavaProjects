
package LinkedLists;


import java.util.*;


public class LinkedListExample1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        //LinkedList ll = new LinkedList();//Stores objects
        LinkedList<String> cities = new LinkedList();//This one can only store strings
        //add elements
        cities.add("New York");
        cities.add("Austin");
        cities.add("Chicago");
        cities.add("New Orleans");
        //print
        System.out.println("Here's your LinkedList: "+ cities);
        //Add element at a position with no worries about shifting eles around
        cities.add(0,"Pittsburgh");
        cities.add("Denver");//This will go on the end by default
        //print again with new 
        System.out.println("Here's your LinkedList: "+ cities);
        
        //remove elements from a linkedlist by index
        cities.remove(0);
        System.out.println("Here's your updated LinkedList: "+ cities);
        //remove by object
        cities.remove("Chicago");
        System.out.println("Here's your updated LinkedList: "+ cities);
        //check a city is in the list
        System.out.print("\nEnter a city to search in the list: ");
        String city = scan.nextLine();
        if(cities.contains(city))
        {
            System.out.println(city+" is in the list at index "+cities.indexOf(city));
        }
        else{
            System.out.println("We do not have " + city + " stored yet");
        }
        
        //get a random element from the Linked List
        System.out.println("\nNot that you asked, but I'm going to show you a random city now.");
        //get random index
        String randomCity = cities.get((int)(Math.random()* cities.size()));
        //sho random city
        System.out.println("Drum roll please... Your random city is - " + randomCity);
        
        //User defined set element
        int i;
        System.out.println("I'm going to be nice and let you add a city to the linked list");
        System.out.println("Current size of list is " + cities.size() + " so please make sure "
                + "you enter an index between 0 and " + (cities.size()-1));
        //prompt user
        System.out.print("So, what city would you like to add? --> ");
        city = scan.nextLine();
        System.out.print(city+ ", Great choice! Which index should I place this at? ");
        i = scan.nextInt();
        
        //Set differes from add because it overides the current element
        //using add would allow us to add to an index AND have the current element shifted(kept)
        //cities.set(i, city);
        cities.add(i, city);//This will force it into the list and keep the old
        System.out.println("\nThe linkedlist with your city included:\n" + cities);
    }
    // Some methods that differ from Array Lists
        /*
            addFirst(Adds element to the start, head)
            addLast (Adds element to the end,   tail)
            element (Retrieves the head element)
            getFirst/Last (Retrives the head OR tail)
            pop     (Removes the front element)
            push    (Creates a new first element)
        */
    
}
