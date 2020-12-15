
package LinkedLists;
import java.util.ArrayList;

/*
Activity: Prompt - Create two String arrays containing cities of two different countries
The size of each array does not matter, but they should differ in size. 

Create an empty String Array List. 

Next, create a void method that takes as arguments
an String array and an ArrayList, loop through the length of the array and add the 
iTH element to the list.

In main call the method twice, once for each city.

Then remove a particular city by name (not index).
*/


public class ArraysToArrayList {

    public static void main(String[] args) {
        
        String[] uk = {"London", "Bournemouth", "Liverpool", "Southampton"};
        
        String[] usa = {"Pittsburgh", "New York City", "LA", "Houston", "Chicago", 
            "Philidelphia", "San Francisco", "Phoenix"};
        
        ArrayList<String> cities = new ArrayList();
        System.out.println("Cities: " + cities);
        
        // Add & Print USA cities to our AL
        addElements(usa, cities);
        System.out.println("Cities: " + cities);
        
        // Add & Print UK cities to our AL
        addElements(uk, cities);
        System.out.println("Cities: " + cities);
        
        // Remove a city (By name NOT position)
        cities.remove("London");
        System.out.println("London removed.");
        System.out.println("Cities: " + cities);
        
    }
    
    // Adds elements of an array to the array list
    public static void addElements(String[] arr, ArrayList al)
    {
        for (int i = 0; i < arr.length; i++) 
        {
            al.add(arr[i]);
        }
    }
    
}
